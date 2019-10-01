package com.javatramp.Lesson1.Task1;

import com.javatramp.Lesson1.Task1.exception.*;
import com.javatramp.Lesson1.Task1.manager.AirlineManager;
import com.javatramp.Lesson1.Task1.specification.ISpecification;
import com.javatramp.Lesson1.Task1.specification.aircraftspecification.IsDirigibleSpecification;
import com.javatramp.Lesson1.Task1.specification.aircraftspecification.MaxPassengersSpecification;
import com.javatramp.Lesson1.Task1.specification.aircraftspecification.MinSpeedSpecification;
import com.javatramp.Lesson1.Task1.specification.logicalcompositor.And;
import com.javatramp.Lesson1.Task1.specification.logicalcompositor.Not;
import com.javatramp.Lesson1.Task1.specification.logicalcompositor.Or;
import com.javatramp.Lesson1.Task1.util.DataReader;
import com.javatramp.Lesson1.Task1.vehicle.Aircraft;
import com.javatramp.Lesson1.Task1.vehicle.Airplane;
import com.javatramp.Lesson1.Task1.vehicle.Dirigible;
import com.javatramp.Lesson1.Task1.vehicle.Helicopter;
import com.javatramp.Lesson1.Task1.warehouse.Airline;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class TestTask1 {

    private static final Logger LOGGER = LogManager.getLogger(TestTask1.class);

    @Test
    public void InvalidDegreeRangeExceptionTest() {
        Airplane airplane = new Airplane("Mig28", 101, 111, 111, 111, 210);
        try {
            airplane.tiltRight(-1);
            fail("Expected an AircraftInvalidDegreeRangeException to be thrown.");
        } catch (AircraftInvalidDegreeRangeException e) {
            assertThat(e.getCODE(), is(ErrorCode.OUT_OF_RANGE_DEGREES_VALUE));
        } finally {
            LOGGER.info("InvalidDegreeRangeExceptionTest");
        }
    }

    @Test
    public void aircraftTakeOffExceptionTest() {
        Airplane airplane = new Airplane("Mig28", 330, 111, 111, 111, 210);
        try {
            airplane.takeOff();
            airplane.takeOff();
            fail("Expected an AircraftTakeOffExceptionTest to be thrown.");
        } catch (AircraftPassengersQuantityException e) {
            System.out.println(ErrorCode.UNAVAILABLE_TAKE_OFF_DUE_TO_PASSENGERS_QUANTITY);
        } catch (AircraftCarryingCapacityException e) {
            System.out.println(ErrorCode.UNAVAILABLE_TAKE_OFF_DUE_TO_CARRYING_CAPACITY_EXCESS);
        } catch (AircraftTakeOffException e) {
            System.out.println(ErrorCode.UNAVAILABLE_TAKE_OFF);
            assertThat(e.getCODE(), is(ErrorCode.UNAVAILABLE_TAKE_OFF));
        }
    }

    @Test
    public void aircraftPassengersQuantityExceptionTest() {
        Helicopter helicopter = new Helicopter("Hel1", 500, 1000, 111, 111, 210);
        try {
            helicopter.takeOff();
            fail("Expected an AircraftPassengersQuantityException to be thrown.");
        } catch (AircraftPassengersQuantityException e) {
            System.out.println(ErrorCode.UNAVAILABLE_TAKE_OFF_DUE_TO_PASSENGERS_QUANTITY);
            assertThat(e.getCODE(), is(ErrorCode.UNAVAILABLE_TAKE_OFF_DUE_TO_PASSENGERS_QUANTITY));
        } catch (AircraftCarryingCapacityException e) {
            System.out.println(ErrorCode.UNAVAILABLE_TAKE_OFF_DUE_TO_CARRYING_CAPACITY_EXCESS);
        } catch (AircraftTakeOffException e) {
            System.out.println(ErrorCode.UNAVAILABLE_TAKE_OFF);
        }
    }

    @Test
    public void aircraftCarryingCapacityException() {
        Dirigible dirigible = new Dirigible("Hel1", 59, 16000, 111, 111, 210);
        try {
            dirigible.takeOff();
        } catch (AircraftPassengersQuantityException e) {
            System.out.println(ErrorCode.UNAVAILABLE_TAKE_OFF_DUE_TO_PASSENGERS_QUANTITY);
        } catch (AircraftCarryingCapacityException e) {
            System.out.println(ErrorCode.UNAVAILABLE_TAKE_OFF_DUE_TO_CARRYING_CAPACITY_EXCESS);
            assertThat(e.getCODE(), is(ErrorCode.UNAVAILABLE_TAKE_OFF_DUE_TO_CARRYING_CAPACITY_EXCESS));
        } catch (AircraftTakeOffException e) {
            System.out.println(ErrorCode.UNAVAILABLE_TAKE_OFF);
        }
    }

    @Test
    public void AircraftLandingExceptionTest() {
        Airplane airplane = new Airplane("SK19", 101, 111, 111, 111, 210);
        try {
            airplane.land();
            fail("Expected an AircraftLandingException to be thrown.");
        } catch (AircraftLandingException e) {
            assertThat(e.getCODE(), is(ErrorCode.UNAVAILABLE_LANDING));
        } finally {
            LOGGER.info("AircraftLandingExceptionTest");
        }
    }


    public static void main(String[] args) {
        Airline vitaliAirline = new Airline("VitaliAir");
        List<Aircraft> filteredAirline;
        AirlineManager airlineManager = new AirlineManager();

        airlineManager.fullFillAirline(DataReader.getData(), vitaliAirline);

        System.out.println("Total carrying capacity is " + airlineManager.showTotalAirlineCarryingCapacity(vitaliAirline));
        System.out.println("Total passengers capacity is " + airlineManager.showTotalAirlinePassengersCapacity(vitaliAirline));

        airlineManager.sortAirlineAircraftByFlightRange(vitaliAirline);
        vitaliAirline.getAircrafts().stream().forEach(aircraft -> {
            System.out.println(aircraft);
        });

        ISpecification<Aircraft> specification = new And<>(new Or<>(
                new MinSpeedSpecification(220),
                new MaxPassengersSpecification(100)
        ),
                new Not<>(new IsDirigibleSpecification())
        );
        filteredAirline = vitaliAirline.getAircrafts().stream().filter(aircraft -> specification.IsSatisfied(aircraft)).collect(Collectors.toList());

        for (Aircraft aircraft : filteredAirline) {
            System.out.println(aircraft);
        }
    }
}
package com.javatramp.Lesson1.Task1;

import com.javatramp.Lesson1.Task1.exception.InvalidDegreeRangeException;
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
import com.javatramp.Lesson1.Task1.warehouse.Airline;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class TestTask1 {

    private static final Logger lOGGER = LogManager.getLogger(TestTask1.class);

    @Test
    public void InvalidDegreeRangeExceptionWithNegativeValueTest() {
        Airplane airplane = new Airplane("Mig28", 101, 111, 111, 111, 210);
        airplane.tiltRight(10);
    }

    @Test
    public void InvalidDegreeRangeExceptionWithOutOfRangeValueTest() {
        Airplane airplane = new Airplane("Mig28", 101, 111, 111, 111, 210);
        airplane.tiltLeft(51);
    }

//    public static void main(String[] args) {
//        Airline vitaliAirline = new Airline("VitaliAir");
//        List<Aircraft> filteredAirline;
//        AirlineManager airlineManager = new AirlineManager();
//
//                airlineManager.fullFillAirline(DataReader.getData(), vitaliAirline);
//
//        System.out.println("Total carrying capacity is " + airlineManager.showTotalAirlineCarryingCapacity(vitaliAirline));
//        System.out.println("Total passengers capacity is " + airlineManager.showTotalAirlinePassengersCapacity(vitaliAirline));
//
//        airlineManager.sortAirlineAircraftByFlightRange(vitaliAirline);
//        vitaliAirline.getAircrafts().stream().forEach(aircraft -> {
//            System.out.println(aircraft);
//        });
//
//        ISpecification<Aircraft> specification = new And<>(new Or<>(
//                new MinSpeedSpecification(220),
//                new MaxPassengersSpecification(100)
//        ),
//                new Not<>(new IsDirigibleSpecification())
//        );
//        filteredAirline = vitaliAirline.getAircrafts().stream().filter(aircraft -> specification.IsSatisfied(aircraft)).collect(Collectors.toList());
//
//        for (Aircraft aircraft : filteredAirline) {
//            System.out.println(aircraft);
//        }
//
//
////passengers exception
//        Aircraft aircraft2 = vitaliAirline.getAircrafts().get(2);
//        aircraft2.takeOff();
////carrying capacity
//        Aircraft aircraft3 = vitaliAirline.getAircrafts().get(3);
//        aircraft3.takeOff();
////take off capacity exception
//        Aircraft aircraft4 = vitaliAirline.getAircrafts().get(4);
//        aircraft3.takeOff();
//        aircraft3.takeOff();
////landing exception
//        aircraft3.land();
//        aircraft3.land();
////flying exception
//        aircraft3.fly();
//    }
}

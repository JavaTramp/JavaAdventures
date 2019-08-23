package com.javatramp.Lesson1.Task1.manager;

import com.javatramp.Lesson1.Task1.vehicle.*;
import com.javatramp.Lesson1.Task1.warehouse.Airline;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AirlineManager {

    private final static Logger logger = LogManager.getLogger(Airline.class);

    public int showTotalAirlineCarryingCapacity(Airline airline) {
        logger.info("Showed total " + airline.getAirlineName() + "'s carrying capacity.");
        return airline.getAircrafts().stream()
                .map(aircraft -> aircraft.getCarryingCapacity())
                .reduce(0, (carryingCapacity1, carryingCapacity2) -> carryingCapacity1 + carryingCapacity2);
    }

    public int showTotalAirlinePassengersCapacity(Airline airline) {
        logger.info("Showed total " + airline.getAirlineName() + "'s passengers capacity.");
        return airline.getAircrafts().stream()
                .map(aircraft -> aircraft.getPassengers())
                .reduce(0, (passengersCapacity1, passengersCapacity2) -> passengersCapacity1 + passengersCapacity2);
    }

    public void sortAirlineAircraftByFlightRange(Airline airline) {
        Collections.sort(airline.getAircrafts(), Comparator.comparingInt(Aircraft::getFlightRange));
    }

    public void fullFillAirline(List<String> lines, Airline airline) {
        if (lines != null || !lines.isEmpty()) {
            lines.stream().forEach((line) -> {
                String[] parameters = line.split("\\s");
                if (parameters[0].equals(AircraftType.AIRPLANE.getAircraftType())) {
                    Aircraft aircraft = new Airplane(parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                    airline.getAircrafts().add(aircraft);
                    logger.info("New " + aircraft + " was added to airline.");
                } else if (parameters[0].equals(AircraftType.DIRIGIBLE.getAircraftType())) {
                    Aircraft aircraft = new Dirigible(parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                    airline.getAircrafts().add(aircraft);
                    logger.info("New " + aircraft + " was added to airline.");
                } else if (parameters[0].equals(AircraftType.HELICOPTER.getAircraftType())) {
                    Aircraft aircraft = new Helicopter(parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                    airline.getAircrafts().add(aircraft);
                    logger.info("New " + aircraft + " was added to airline.");
                }
            });
        }
    }
}

package com.javatramp.Lesson1.Task1.airlines;


import com.javatramp.Lesson1.Task1.vehicle.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Airline {

    private final static Logger logger = LogManager.getLogger(Airline.class);

    public List<Aircraft> fullFillAirline(List<String> lines) {
        List<Aircraft> airline = new ArrayList<>();
        if (lines != null || !lines.isEmpty()) {
            lines.stream().forEach((line) -> {
                String[] parameters = line.split("\\s");
                if (parameters[0].equals(AircraftType.AIRPLANE.getAircraftType())) {
                    Aircraft aircraft = new Airplane(parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                    airline.add(aircraft);
                    logger.info("New " + aircraft + " was added to airline.");
                } else if (parameters[0].equals(AircraftType.DIRIGIBLE.getAircraftType())) {
                    Aircraft aircraft = new Dirigible(parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                    airline.add(aircraft);
                    logger.info("New " + aircraft + " was added to airline.");
                } else if (parameters[0].equals(AircraftType.HELICOPTER.getAircraftType())){
                    Aircraft aircraft = new Helicopter(parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                    airline.add(aircraft);
                    logger.info("New " + aircraft + " was added to airline.");
                }
            });
        }

        return airline;
    }

}

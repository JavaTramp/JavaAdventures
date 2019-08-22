package com.javatramp.Lesson1.Task1.warehouse;

import com.javatramp.Lesson1.Task1.vehicle.Aircraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class Airl

    private final static Logger logger = LogManager.getLogger(Airline.class);

    private List<Aircraft> aircrafts;

    private String airlineName;

    public Airline() {
    }

    public Airline(String airlineName) {
        this.airlineName = airlineName;
        aircrafts = new ArrayList<>();
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
}

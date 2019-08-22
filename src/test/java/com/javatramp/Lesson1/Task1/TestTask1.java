package com.javatramp.Lesson1.Task1;

import com.javatramp.Lesson1.Task1.manager.AirlineManager;
import com.javatramp.Lesson1.Task1.util.DataReader;
import com.javatramp.Lesson1.Task1.warehouse.Airline;

import java.util.List;

public class TestTask1 {

    public static void main(String[] args) {
        Airline vitaliAirline = new Airline("VitaliAir");
        AirlineManager airlineManager = new AirlineManager();
        airlineManager.fullFillAirline(DataReader.getData(), vitaliAirline);
        System.out.println("Total carrying capacity is " + airlineManager.showTotalAirlineCarryingCapacity(vitaliAirline));
        System.out.println("Total passengers capacity is " + airlineManager.showTotalAirlinePassengersCapacity(vitaliAirline));
        airlineManager.sortAirlineAircraftByFlightRange(vitaliAirline);
        System.out.println(vitaliAirline.getAirlineName());
        vitaliAirline.getAircrafts().stream().forEach(aircraft -> {
            System.out.println(aircraft);
        });
    }
}

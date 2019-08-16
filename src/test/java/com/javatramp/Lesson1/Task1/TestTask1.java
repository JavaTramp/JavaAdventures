package com.javatramp.Lesson1.Task1;

import com.javatramp.Lesson1.Task1.airlines.Airline;
import com.javatramp.Lesson1.Task1.util.DataReader;
import com.javatramp.Lesson1.Task1.vehicle.Aircraft;

import java.util.ArrayList;
import java.util.List;

public class TestTask1 {

    public static void main(String[] args) {
        List<Aircraft> airline = new ArrayList<>();
        airline = new Airline().fullFillAirline(DataReader.getData());
        airline.stream().forEach(aircraft -> {
            System.out.println(aircraft);
        });
    }
}

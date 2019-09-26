package com.javatramp.Lesson1.Task1.vehicle;

import com.javatramp.Lesson1.Task1.exception.InvalidDegreeRangeException;
import com.javatramp.Lesson1.Task1.validator.DegreesValidator;

public class Airplane extends Aircraft {

    public Airplane() {
    }

    public Airplane(String model, int passengers, int carryingCapacity, int flightRange, int altitude, int speed) {
        super(model, passengers, carryingCapacity, flightRange, altitude, speed);
    }

    public void tiltRight(int degrees){
        try {
            DegreesValidator.validateInclinationDegrees(degrees);
        } catch (InvalidDegreeRangeException e) {
            e.printStackTrace();
            e.getCODE();
        }
        System.out.println(this.getModel() + " has tilted right on " + degrees + "degrees.");
    }

    public void tiltLeft(int degrees) {
        try {
            DegreesValidator.validateInclinationDegrees(degrees);
        } catch (InvalidDegreeRangeException e) {
            e.printStackTrace();
            e.getCODE();
        }
        System.out.println(this.getModel() + " has tilted left on " + degrees + "degrees.");
    }

    @Override
    public void takeOff() {
        System.out.println(this.getModel() + " has took off.");
    }

    @Override
    public void fly() {
        System.out.println(this.getModel() + " is flying.");
    }

    @Override
    public void land() {
        System.out.println(this.getModel() + " has landed.");
    }
}

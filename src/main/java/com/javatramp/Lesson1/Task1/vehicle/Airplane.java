package com.javatramp.Lesson1.Task1.vehicle;

public class Airplane extends Aircraft {

    public Airplane() {
    }

    public Airplane(int passengers, int carryingCapacity, int flightRange, int altitude, int speed, String model) {
        super(passengers, carryingCapacity, flightRange, altitude, speed, model);
    }

    public void tilt(int degrees){
        System.out.println(this.getModel() + " has tilted on " + degrees + "degrees.");
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

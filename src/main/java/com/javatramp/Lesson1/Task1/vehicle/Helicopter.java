package com.javatramp.Lesson1.Task1.vehicle;

public class Helicopter extends Aircraft {

    public Helicopter() {
    }

    public Helicopter(String model, int passengers, int carryingCapacity, int flightRange, int altitude, int speed) {
        super(model, passengers, carryingCapacity, flightRange, altitude, speed);
    }

    public void hover() {
        System.out.println(this.getModel() + " is hovering.");
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

package com.javatramp.Lesson1.Task1.vehicle;

public class Dirigible extends Aircraft {

    public Dirigible() {
    }

    public Dirigible(String model, int passengers, int carryingCapacity, int flightRange, int altitude, int speed) {
        super(model, passengers, carryingCapacity, flightRange, altitude, speed);
    }

    public void hoverWithoutFuelCosts() {
        System.out.println(this.getModel() + " is hovering without fuel costs.");
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

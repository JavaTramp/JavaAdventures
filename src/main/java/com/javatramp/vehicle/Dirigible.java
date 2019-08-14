package com.javatramp.vehicle;

public class Dirigible extends Aircraft {

    public Dirigible() {
    }

    public Dirigible(int passengers, int carryingCapacity, int flightRange, int altitude, int speed, String model) {
        super(passengers, carryingCapacity, flightRange, altitude, speed, model);
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

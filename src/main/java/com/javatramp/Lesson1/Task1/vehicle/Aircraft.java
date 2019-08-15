package com.javatramp.Lesson1.Task1.vehicle;

import java.util.Objects;

public abstract class Aircraft implements Vehicle {

    private int passengers;
    private int carryingCapacity;
    private int flightRange;
    private int altitude;
    private int speed;
    private String model;

    public Aircraft() {
    }

    public Aircraft(int passengers, int carryingCapacity, int flightRange, int altitude, int speed, String model) {
        this.passengers = passengers;
        this.carryingCapacity = carryingCapacity;
        this.flightRange = flightRange;
        this.altitude = altitude;
        this.speed = speed;
        this.model = model;
    }

    public abstract void takeOff();

    public abstract void fly();

    public abstract void land();

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aircraft)) return false;
        Aircraft aircraft = (Aircraft) o;
        return getPassengers() == aircraft.getPassengers() &&
                getCarryingCapacity() == aircraft.getCarryingCapacity() &&
                getFlightRange() == aircraft.getFlightRange() &&
                getAltitude() == aircraft.getAltitude() &&
                getSpeed() == aircraft.getSpeed() &&
                Objects.equals(getModel(), aircraft.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPassengers(), getCarryingCapacity(), getFlightRange(), getAltitude(), getSpeed(), getModel());
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "passengers=" + passengers +
                ", carryingCapacity=" + carryingCapacity +
                ", flightRange=" + flightRange +
                ", altitude=" + altitude +
                ", speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }
}

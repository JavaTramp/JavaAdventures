package com.javatramp.Lesson1.Task1.vehicle;

import com.javatramp.Lesson1.Task1.exception.*;

import java.util.Objects;

public abstract class Aircraft implements Vehicle {

    private String model;
    private int passengers;
    private int carryingCapacity;
    private int flightRange;
    private int altitude;
    private int speed;
    private boolean soared;


    public Aircraft() {
    }

    public Aircraft(String model, int passengers, int carryingCapacity, int flightRange, int altitude, int speed) {
        this.passengers = passengers;
        this.carryingCapacity = carryingCapacity;
        this.flightRange = flightRange;
        this.altitude = altitude;
        this.speed = speed;
        this.model = model;
    }

    public abstract void takeOff() throws AircraftTakeOffException;

    public final void fly() {
        System.out.println(this.getModel() + " is flying.");
    }

    public abstract void land() throws AircraftLandingException;

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

    public boolean isSoared() {
        return soared;
    }

    public void setSoared(boolean soared) {
        this.soared = soared;
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
                soared == aircraft.soared &&
                Objects.equals(getModel(), aircraft.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getPassengers(), getCarryingCapacity(), getFlightRange(), getAltitude(), getSpeed(), soared);
    }

    @Override
    public String toString() {
        return "Model='" + model + '\'' +
                ", passengers=" + passengers +
                ", carryingCapacity=" + carryingCapacity +
                ", flightRange=" + flightRange +
                ", altitude=" + altitude +
                ", speed=" + speed +
                ", soared=" + soared +
                '}';
    }
}

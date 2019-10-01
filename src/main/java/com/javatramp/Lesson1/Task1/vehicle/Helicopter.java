package com.javatramp.Lesson1.Task1.vehicle;

import com.javatramp.Lesson1.Task1.exception.AircraftCarryingCapacityException;
import com.javatramp.Lesson1.Task1.exception.AircraftPassengersQuantityException;
import com.javatramp.Lesson1.Task1.exception.AircraftTakeOffException;
import com.javatramp.Lesson1.Task1.exception.ErrorCode;

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
    public void takeOff() throws AircraftTakeOffException {
        if (this.isSoared()) {
            throw new AircraftTakeOffException(ErrorCode.UNAVAILABLE_TAKE_OFF);
        } else if (this.getPassengers() > 10) {
            throw new AircraftPassengersQuantityException(ErrorCode.UNAVAILABLE_TAKE_OFF_DUE_TO_PASSENGERS_QUANTITY);
        } else if (this.getCarryingCapacity() > 2000) {
            throw new AircraftCarryingCapacityException(ErrorCode.UNAVAILABLE_TAKE_OFF_DUE_TO_CARRYING_CAPACITY_EXCESS);
        } else {
            this.setSoared(true);
            System.out.println(this.getModel() + " has took off.");
        }
    }

    @Override
    public void land() {
        System.out.println(this.getModel() + " has landed.");
    }
}

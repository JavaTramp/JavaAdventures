package com.javatramp.Lesson1.Task1.vehicle;

import com.javatramp.Lesson1.Task1.exception.AircraftCarryingCapacityException;
import com.javatramp.Lesson1.Task1.exception.AircraftPassengersQuantityException;
import com.javatramp.Lesson1.Task1.exception.AircraftTakeOffException;
import com.javatramp.Lesson1.Task1.exception.ErrorCode;

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
    public void takeOff() throws AircraftTakeOffException {
        if (this.isSoared()) {
            throw new AircraftTakeOffException(ErrorCode.UNAVAILABLE_TAKE_OFF);
        } else if (this.getPassengers() > 100) {
            throw new AircraftPassengersQuantityException(ErrorCode.UNAVAILABLE_TAKE_OFF_DUE_TO_PASSENGERS_QUANTITY);
        } else if (this.getCarryingCapacity() > 15000) {
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

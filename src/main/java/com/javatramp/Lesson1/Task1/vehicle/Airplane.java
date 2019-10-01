package com.javatramp.Lesson1.Task1.vehicle;

import com.javatramp.Lesson1.Task1.exception.*;
import com.javatramp.Lesson1.Task1.validator.AircraftDegreesValidator;

public class Airplane extends Aircraft {

    public Airplane() {
    }

    public Airplane(String model, int passengers, int carryingCapacity, int flightRange, int altitude, int speed) {
        super(model, passengers, carryingCapacity, flightRange, altitude, speed);
    }

    public void tiltRight(int degrees) throws AircraftInvalidDegreeRangeException {
        if (AircraftDegreesValidator.validateInclinationDegrees(degrees)) {
            System.out.println(this.getModel() + " has tilted left on " + degrees + "degrees.");
        } else {
            throw new AircraftInvalidDegreeRangeException(ErrorCode.OUT_OF_RANGE_DEGREES_VALUE);
        }
    }

    public void tiltLeft(int degrees) throws AircraftInvalidDegreeRangeException {
        if (AircraftDegreesValidator.validateInclinationDegrees(degrees)) {
            System.out.println(this.getModel() + " has tilted left on " + degrees + "degrees.");
        } else {
            throw new AircraftInvalidDegreeRangeException(ErrorCode.OUT_OF_RANGE_DEGREES_VALUE);
        }
    }

    @Override
    public void takeOff() throws AircraftTakeOffException {
        if (this.isSoared()) {
            throw new AircraftTakeOffException(ErrorCode.UNAVAILABLE_TAKE_OFF);
        } else if (this.getPassengers() > 300) {
            throw new AircraftPassengersQuantityException(ErrorCode.UNAVAILABLE_TAKE_OFF_DUE_TO_PASSENGERS_QUANTITY);
        } else if (this.getCarryingCapacity() > 35000) {
            throw new AircraftCarryingCapacityException(ErrorCode.UNAVAILABLE_TAKE_OFF_DUE_TO_CARRYING_CAPACITY_EXCESS);
        } else {
            this.setSoared(true);
        }
    }

    @Override
    public void land() throws AircraftLandingException {
        if (this.isSoared()) {
            this.setSoared(false);
        } else {
            throw new AircraftLandingException(ErrorCode.UNAVAILABLE_LANDING);
        }
    }
}

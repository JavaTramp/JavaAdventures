package com.javatramp.Lesson1.Task1.specification.aircraftspecification;

import com.javatramp.Lesson1.Task1.specification.ISpecification;
import com.javatramp.Lesson1.Task1.vehicle.Aircraft;

public class MaxPassengersSpecification implements ISpecification<Aircraft> {
    private final int maxPassengers;

    public MaxPassengersSpecification(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public boolean IsSatisfied(Aircraft aircraft) {
        return aircraft.getPassengers() <= maxPassengers;
    }
}

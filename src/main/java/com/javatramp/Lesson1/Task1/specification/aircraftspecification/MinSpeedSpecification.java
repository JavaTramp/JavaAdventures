package com.javatramp.Lesson1.Task1.specification.aircraftspecification;

import com.javatramp.Lesson1.Task1.specification.ISpecification;
import com.javatramp.Lesson1.Task1.vehicle.Aircraft;

public class MinSpeedSpecification implements ISpecification<Aircraft> {

    private final int minSpeed;

    public MinSpeedSpecification(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    @Override
    public boolean IsSatisfied(Aircraft aircraft) {
        return aircraft.getSpeed() >= minSpeed;
    }
}

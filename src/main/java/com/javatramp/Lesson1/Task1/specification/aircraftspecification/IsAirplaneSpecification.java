package com.javatramp.Lesson1.Task1.specification.aircraftspecification;

import com.javatramp.Lesson1.Task1.specification.ISpecification;
import com.javatramp.Lesson1.Task1.vehicle.Aircraft;
import com.javatramp.Lesson1.Task1.vehicle.Airplane;

public class IsAirplaneSpecification implements ISpecification<Aircraft> {

    @Override
    public boolean IsSatisfied(Aircraft aircraft) {
        return aircraft.getClass() == Airplane.class;
    }
}

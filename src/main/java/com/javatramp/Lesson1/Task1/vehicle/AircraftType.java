package com.javatramp.Lesson1.Task1.vehicle;

public enum AircraftType {
    AIRPLANE("Airplane"), DIRIGIBLE("Dirigible"), HELICOPTER("Helicopter");
    private String aircraftType;

    AircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getAircraftType(){
        return aircraftType;
    }
}

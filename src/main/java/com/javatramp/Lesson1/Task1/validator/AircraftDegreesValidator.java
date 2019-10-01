package com.javatramp.Lesson1.Task1.validator;

public class AircraftDegreesValidator {
    public static boolean validateInclinationDegrees(int degrees) {
        if (degrees < 0 || degrees > 50) {
            return false;
        } else {
            return true;
        }
    }
}

package com.javatramp.Lesson1.Task1.validator;

import com.javatramp.Lesson1.Task1.exception.ErrorCode;
import com.javatramp.Lesson1.Task1.exception.InvalidDegreeRangeException;

public class DegreesValidator {
    public static void validateInclinationDegrees(int degrees) throws InvalidDegreeRangeException {
        if (degrees < 0) {
            throw new InvalidDegreeRangeException(ErrorCode.NEGATIVE_DEGREES_VALUE);
        } else if (degrees > 50) {
            throw new InvalidDegreeRangeException(ErrorCode.OUT_OF_RANGE_DEGREES_VALUE);
        }
    }
}

package com.javatramp.Lesson1.Task1.exception;

public class AircraftInvalidDegreeRangeException extends AircraftException {

    public AircraftInvalidDegreeRangeException(ErrorCode CODE) {
        super(CODE);
    }

    public AircraftInvalidDegreeRangeException(String message, ErrorCode CODE) {
        super(message, CODE);
    }

    public AircraftInvalidDegreeRangeException(String message, Throwable cause, ErrorCode CODE) {
        super(message, cause, CODE);
    }

    public AircraftInvalidDegreeRangeException(Throwable cause, ErrorCode CODE) {
        super(cause, CODE);
    }

    public AircraftInvalidDegreeRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ErrorCode CODE) {
        super(message, cause, enableSuppression, writableStackTrace, CODE);
    }
}

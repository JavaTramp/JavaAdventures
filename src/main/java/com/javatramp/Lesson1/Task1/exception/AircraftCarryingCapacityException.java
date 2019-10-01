package com.javatramp.Lesson1.Task1.exception;

public final class AircraftCarryingCapacityException extends AircraftTakeOffException {

    public AircraftCarryingCapacityException(ErrorCode CODE) {
        super(CODE);
    }

    public AircraftCarryingCapacityException(String message, ErrorCode CODE) {
        super(message, CODE);
    }

    public AircraftCarryingCapacityException(String message, Throwable cause, ErrorCode CODE) {
        super(message, cause, CODE);
    }

    public AircraftCarryingCapacityException(Throwable cause, ErrorCode CODE) {
        super(cause, CODE);
    }

    public AircraftCarryingCapacityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ErrorCode CODE) {
        super(message, cause, enableSuppression, writableStackTrace, CODE);
    }
}

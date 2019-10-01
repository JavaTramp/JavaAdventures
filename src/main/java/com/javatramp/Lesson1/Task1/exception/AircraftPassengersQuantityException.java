package com.javatramp.Lesson1.Task1.exception;

public final class AircraftPassengersQuantityException extends AircraftTakeOffException {

    public AircraftPassengersQuantityException(ErrorCode CODE) {
        super(CODE);
    }

    public AircraftPassengersQuantityException(String message, ErrorCode CODE) {
        super(message, CODE);
    }

    public AircraftPassengersQuantityException(String message, Throwable cause, ErrorCode CODE) {
        super(message, cause, CODE);
    }

    public AircraftPassengersQuantityException(Throwable cause, ErrorCode CODE) {
        super(cause, CODE);
    }

    public AircraftPassengersQuantityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ErrorCode CODE) {
        super(message, cause, enableSuppression, writableStackTrace, CODE);
    }
}

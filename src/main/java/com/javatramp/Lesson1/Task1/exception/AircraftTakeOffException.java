package com.javatramp.Lesson1.Task1.exception;

public class AircraftTakeOffException extends AircraftStateException {


    public AircraftTakeOffException(ErrorCode CODE) {
        super(CODE);
    }

    public AircraftTakeOffException(String message, ErrorCode CODE) {
        super(message, CODE);
    }

    public AircraftTakeOffException(String message, Throwable cause, ErrorCode CODE) {
        super(message, cause, CODE);
    }

    public AircraftTakeOffException(Throwable cause, ErrorCode CODE) {
        super(cause, CODE);
    }

    public AircraftTakeOffException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ErrorCode CODE) {
        super(message, cause, enableSuppression, writableStackTrace, CODE);
    }
}

package com.javatramp.Lesson1.Task1.exception;

public final class AircraftLandingException extends AircraftStateException {
    public AircraftLandingException(ErrorCode CODE) {
        super(CODE);
    }

    public AircraftLandingException(String message, ErrorCode CODE) {
        super(message, CODE);
    }

    public AircraftLandingException(String message, Throwable cause, ErrorCode CODE) {
        super(message, cause, CODE);
    }

    public AircraftLandingException(Throwable cause, ErrorCode CODE) {
        super(cause, CODE);
    }

    public AircraftLandingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ErrorCode CODE) {
        super(message, cause, enableSuppression, writableStackTrace, CODE);
    }
}

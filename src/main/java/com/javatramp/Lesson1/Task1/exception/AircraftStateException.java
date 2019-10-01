package com.javatramp.Lesson1.Task1.exception;

public class AircraftStateException extends AircraftException {
    public AircraftStateException(ErrorCode CODE) {
        super(CODE);
    }

    public AircraftStateException(String message, ErrorCode CODE) {
        super(message, CODE);
    }

    public AircraftStateException(String message, Throwable cause, ErrorCode CODE) {
        super(message, cause, CODE);
    }

    public AircraftStateException(Throwable cause, ErrorCode CODE) {
        super(cause, CODE);
    }

    public AircraftStateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ErrorCode CODE) {
        super(message, cause, enableSuppression, writableStackTrace, CODE);
    }
}

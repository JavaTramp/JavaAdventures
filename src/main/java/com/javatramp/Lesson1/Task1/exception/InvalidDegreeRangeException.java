package com.javatramp.Lesson1.Task1.exception;

public class InvalidDegreeRangeException extends Exception {

    private final ErrorCode CODE;

    public InvalidDegreeRangeException(ErrorCode CODE) {
        this.CODE = CODE;
    }

    public InvalidDegreeRangeException(String message, ErrorCode CODE) {
        super(message);
        this.CODE = CODE;
    }

    public InvalidDegreeRangeException(String message, Throwable cause, ErrorCode CODE) {
        super(message, cause);
        this.CODE = CODE;
    }

    public InvalidDegreeRangeException(Throwable cause, ErrorCode CODE) {
        super(cause);
        this.CODE = CODE;
    }

    public InvalidDegreeRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ErrorCode CODE) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.CODE = CODE;
    }

    public ErrorCode getCODE() {
        return CODE;
    }
}

package com.test.testjava.exception;

public enum ApiExceptionMessage {
    PRICE_NOT_FOUND("Price not found");

    private final String message;

    public String getMessage() {
        return this.message;
    }

    ApiExceptionMessage(String message) {
        this.message = message;
    }
}

package com.test.testjava.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

public class ApiException extends RuntimeException {
    private static final long serialVersionUID = 6903369439619688566L;

    @Getter
    private final ApiExceptionMessage exceptionMessage;
    @Getter
    private final HttpStatus httpStatus;

    public ApiException(ApiExceptionMessage exceptionMessage, HttpStatus httpStatus) {
        super(exceptionMessage.getMessage());
        this.exceptionMessage = exceptionMessage;
        this.httpStatus = httpStatus;
    }
}

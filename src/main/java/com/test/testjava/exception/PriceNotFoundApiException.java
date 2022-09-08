package com.test.testjava.exception;

import org.springframework.http.HttpStatus;

public class PriceNotFoundApiException extends ApiException {
    private static final long serialVersionUID = -4900603489602975381L;

    public PriceNotFoundApiException() {
        super(ApiExceptionMessage.PRICE_NOT_FOUND, HttpStatus.NOT_FOUND);
    }
}

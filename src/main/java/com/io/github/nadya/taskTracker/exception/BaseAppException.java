package com.io.github.nadya.taskTracker.exception;

import org.springframework.http.HttpStatus;

public abstract class BaseAppException extends RuntimeException {

    private final String code;
    private final HttpStatus status;

    protected BaseAppException(String message, String code, HttpStatus status) {
        super(message);
        this.code = code;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public HttpStatus getStatus() {
        return status;
    }
}


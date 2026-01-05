package com.back.global.initData.exception;

public class NotFoundException extends DomainException {
    public NotFoundException(String message) {
        super("404", message);
    }
}
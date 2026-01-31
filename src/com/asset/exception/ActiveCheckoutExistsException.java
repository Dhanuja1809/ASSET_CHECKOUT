package com.asset.exception;

public class ActiveCheckoutExistsException extends Exception {
    public ActiveCheckoutExistsException(String message) {
        super(message);
    }
}

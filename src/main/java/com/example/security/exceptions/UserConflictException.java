package com.example.security.exceptions;

public class UserConflictException extends RuntimeException{
    public UserConflictException() {
        super();
    }

    public UserConflictException(String message) {
        super(message);
    }
}

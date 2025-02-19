package com.example.security.common;

import java.time.LocalDateTime;

public record ErrorResponse(String message, int status, LocalDateTime timestamp) {
    public ErrorResponse(String message, int status) {
        this(message, status, LocalDateTime.now()); // Set the current date and time
    }
}

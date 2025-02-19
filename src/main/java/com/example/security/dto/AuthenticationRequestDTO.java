package com.example.security.dto;

public record AuthenticationRequestDTO(
        String email,
        String password
) {}

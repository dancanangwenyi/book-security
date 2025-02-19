package com.example.security.dtos;

public record AuthenticationRequestDTO(
        String email,
        String password
) {}

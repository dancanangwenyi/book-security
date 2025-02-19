package com.example.security.dtos;

import com.sayuri.security.models.Role;

public record RegisterRequestDTO(
        String firstName,
        String lastName,
        String email,
        String password,
        Role role
) {}

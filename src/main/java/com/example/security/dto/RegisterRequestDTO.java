package com.example.security.dto;

import com.example.security.model.Role;

public record RegisterRequestDTO(
        String firstName,
        String lastName,
        String email,
        String password,
        Role role
) {}

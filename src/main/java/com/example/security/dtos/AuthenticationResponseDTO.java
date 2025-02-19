package com.example.security.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sayuri.security.models.Role;

public record AuthenticationResponseDTO(
        @JsonProperty("accessToken") String accessToken,
        @JsonProperty("refreshToken") String refreshToken,
        Long id,
        String firstName,
        String lastName,
        String email,
        Role role
) {}

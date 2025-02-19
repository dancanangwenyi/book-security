package com.example.security.dto;

import com.example.security.model.Role;
import com.fasterxml.jackson.annotation.JsonProperty;

public record AuthenticationResponseDTO(
        @JsonProperty("accessToken") String accessToken,
        @JsonProperty("refreshToken") String refreshToken,
        Long id,
        String firstName,
        String lastName,
        String email,
        Role role
) {}

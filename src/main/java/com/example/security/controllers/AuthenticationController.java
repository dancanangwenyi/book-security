package com.example.security.controllers;

import com.example.security.dtos.AuthenticationRequestDTO;
import com.example.security.dtos.AuthenticationResponseDTO;
import com.example.security.dtos.RegisterRequestDTO;
import com.example.security.services.AuthenticationService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/auth")
@Slf4j
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    /**
     * Register a new user.
     *
     * @param registerRequest the user registration request payload
     * @return a response containing the authentication tokens
     */
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponseDTO> register(@RequestBody RegisterRequestDTO registerRequest) {
        AuthenticationResponseDTO authenticationResponse = authenticationService.register(registerRequest);
        return new ResponseEntity<>(authenticationResponse, HttpStatus.CREATED);
    }

    /**
     * Authenticate an existing user.
     *
     * @param authenticationRequest the login request with credentials
     * @return a response containing the authentication tokens
     */
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponseDTO> authenticate(@RequestBody AuthenticationRequestDTO authenticationRequest) {
        AuthenticationResponseDTO authenticationResponse = authenticationService.authenticate(authenticationRequest);
        return new ResponseEntity<>(authenticationResponse, HttpStatus.OK);
    }

    /**
     * Refresh the authentication token using the refresh token.
     *
     * @param request the HTTP request containing the refresh token
     * @param response the HTTP response for returning the new tokens
     * @throws IOException in case of input-output error
     */
    @PostMapping("/refresh-token")
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
        authenticationService.refreshToken(request, response);
    }
}

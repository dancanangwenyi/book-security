package com.example.security.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Dancan Angwenyi",
                        email = "dancangwe@gmail.com",
                        url = "https://www.linkedin.com/in/dancan-angwenyi-687752101/"
                ),
                description = "OpenApi documentation for Spring Security with JWT authentication",
                title = "OpenApi specification - Dancan Angwenyi",
                version = "1.0",
                license = @License(
                        name = "MIT License",  // Consider using an actual license name, e.g., MIT, Apache, etc.
                        url = "https://opensource.org/licenses/MIT"  // URL to the license
                ),
                termsOfService = "https://example.com/terms"  // A URL to the terms of service if available
        ),
        servers = {
                @Server(
                        description = "DEV Environment",
                        url = "http://localhost:9005"  // Make sure this matches the actual DEV URL
                ),
                @Server(
                        description = "PROD Environment",
                        url = "https://api.production-url.com"  // Adjust this URL for production environment
                )
        },
        security = {
                @SecurityRequirement(
                        name = "bearerAuth"
                )
        }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT Authentication using Bearer Token",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}

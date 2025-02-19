package com.example.security.configs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "application.security.jwt")
public class JwtConfig {
    private String secretKey;
    private long expiration;
    private RefreshToken refreshToken;

    @Getter
    @Setter
    public static class RefreshToken {
        private long expiration;
    }
}

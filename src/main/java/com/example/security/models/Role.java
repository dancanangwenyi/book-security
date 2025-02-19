package com.example.security.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.example.security.models.Permission.*;

@RequiredArgsConstructor
public enum Role {

    USER(
            Set.of(
                    BOOK_VIEW  // User can view books
            )
    ),

    ADMIN(
            Set.of(
                    BOOK_CREATE,  // Admin can add books
                    BOOK_UPDATE,  // Admin can update book details
                    BOOK_DELETE,  // Admin can remove books
                    BOOK_VIEW,    // Admin can view books
                    USER_CREATE,  // Admin can create users
                    USER_UPDATE,  // Admin can update users
                    USER_DELETE,  // Admin can delete users
                    USER_VIEW,    // Admin can view user details
                    SECURITY_MANAGE, // Admin can manage security settings
                    AUTH_VIEW     // Admin can view authentication logs
            )
    ),

    MANAGER(
            Set.of(
                    BOOK_CREATE,  // Manager can add books
                    BOOK_UPDATE,  // Manager can update books
                    BOOK_VIEW     // Manager can view books
            )
    );

    @Getter
    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }
}

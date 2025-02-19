package com.example.security.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {

    // 🔹 Admin Permissions
    ADMIN_READ("admin:read", "Permission to view admin-level data and settings."),
    ADMIN_UPDATE("admin:update", "Permission to update admin-level data and settings."),
    ADMIN_CREATE("admin:create", "Permission to create new admin-level data or settings."),
    ADMIN_DELETE("admin:delete", "Permission to delete admin-level data or settings."),

    // 🔹 User Management Permissions
    USER_CREATE("user:create", "Permission to create new users in the system."),
    USER_UPDATE("user:update", "Permission to update user details or roles."),
    USER_DELETE("user:delete", "Permission to delete users from the system."),
    USER_VIEW("user:view", "Permission to view user details."),

    // 🔹 Book Management Permissions
    BOOK_CREATE("book:create", "Permission to add new books to the system."),
    BOOK_UPDATE("book:update", "Permission to modify book details."),
    BOOK_DELETE("book:delete", "Permission to remove books from the system."),
    BOOK_VIEW("book:view", "Permission to view book details."),

    // 🔹 Security & Authentication Permissions
    SECURITY_MANAGE("security:manage", "Permission to configure security settings."),
    AUTH_VIEW("auth:view", "Permission to view authentication logs and status.");

    @Getter
    private final String permission;

    @Getter
    private final String description;
}

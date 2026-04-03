package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Auth {

    private UUID authId;

    private String loginIdentifier;

    private String passwordHash;

    private String role;

    private String entityType;

    private UUID entityId;

    private boolean isActive;

    private LocalDateTime lastLoginAt;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
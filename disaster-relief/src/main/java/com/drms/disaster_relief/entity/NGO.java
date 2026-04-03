package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class NGO {

    private UUID ngoId;

    private String organizationName;

    private String registrationNumber;

    private String contactPersonName;

    private String phoneNumber;

    private String email;

    private String website;

    private String description;

    private int trustScore;

    private boolean isActive;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
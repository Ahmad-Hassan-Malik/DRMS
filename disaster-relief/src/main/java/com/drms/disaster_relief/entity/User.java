package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class User {

    private UUID userId;

    private String fullName;

    private String cnic;

    private String phoneNumber;

    private String email;

    private String city;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
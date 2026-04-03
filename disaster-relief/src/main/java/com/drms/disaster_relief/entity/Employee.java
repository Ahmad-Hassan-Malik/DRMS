package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Employee {

    private UUID employeeId;

    private UUID branchId;

    private String fullName;

    private String cnic;

    private String phoneNumber;

    private String email;

    private String role;

    private String specialization;

    private String availabilityStatus;

    private boolean isActive;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
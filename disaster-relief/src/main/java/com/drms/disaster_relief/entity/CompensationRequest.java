package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class CompensationRequest {

    private UUID requestId;

    private UUID userId;

    private UUID cityId;

    private String damageType;

    private String description;

    private float estimatedValue;

    private String bankName;

    private String accountTitle;

    private String accountNumber;

    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
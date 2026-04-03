package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class EmergencyContact {

    private UUID contactId;

    private UUID cityId;

    private UUID createdBy;

    private String contactName;

    private String phoneNumber;

    private String category;

    private LocalDateTime createdAt;
}
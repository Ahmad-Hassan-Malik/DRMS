package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class VolunteerApplication {

    private UUID applicationId;

    private UUID userId;

    private UUID ngoId;

    private String skills;

    private String availability;

    private boolean ownTransport;

    private LocalDateTime createdAt;
}
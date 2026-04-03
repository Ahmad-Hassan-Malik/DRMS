package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class MissionNgoAssignment {

    private UUID id;

    private UUID missionId;

    private UUID ngoId;

    private String responseStatus;

    private boolean proposedLogistics;

    private int durationDays;

    private String remarks;

    private LocalDateTime assignedAt;
}
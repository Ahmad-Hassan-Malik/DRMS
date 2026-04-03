package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class MissionLog {

    private UUID logId;

    private UUID missionId;

    private UUID changedBy;

    private String changedByType;

    private String status;

    private String remarks;

    private LocalDateTime changedAt;
}
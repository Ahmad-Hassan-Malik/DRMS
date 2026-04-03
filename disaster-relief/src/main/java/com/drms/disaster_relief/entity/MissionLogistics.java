package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class MissionLogistics {

    private UUID id;

    private UUID missionId;

    private UUID logisticsId;

    private UUID confirmedBy;

    private String returnStatus;

    private String conditionOnReturn;

    private String remarks;

    private LocalDateTime assignedAt;

    private LocalDateTime returnedAt;
}
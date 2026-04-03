package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class MissionCrewAssignment {

    private UUID id;

    private UUID missionId;

    private UUID employeeId;

    private boolean acknowledged;

    private LocalDateTime assignedAt;
}
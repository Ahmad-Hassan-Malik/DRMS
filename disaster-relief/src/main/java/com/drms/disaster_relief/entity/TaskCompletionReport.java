package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class TaskCompletionReport {

    private UUID reportId;

    private UUID missionId;

    private UUID ngoId;

    private UUID approvedBy;

    private int peopleHelped;

    private String resourcesUsed;

    private String challenges;

    private String filePath;

    private boolean approved;

    private LocalDateTime submittedAt;

    private LocalDateTime approvedAt;
}
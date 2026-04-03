package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class NgoTrustLog {

    private UUID logId;

    private UUID ngoId;

    private UUID missionId;

    private UUID changedBy;

    private int changeAmount;

    private String reason;

    private LocalDateTime changedAt;
}
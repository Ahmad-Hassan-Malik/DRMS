package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class HelpRequestLog {

    private UUID logId;

    private UUID requestId;

    private UUID changedBy;

    private String status;

    private String remarks;

    private LocalDateTime changedAt;
}
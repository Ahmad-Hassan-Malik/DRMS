package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class CompensationProof {

    private UUID proofId;

    private UUID requestId;

    private UUID uploadedBy;

    private String filePath;

    private String description;

    private LocalDateTime uploadedAt;
}
package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class HelpRequest {

    private UUID requestId;

    private UUID userId;

    private UUID cityId;

    private String area;

    private String nearestLandmark;

    private float locationLat;

    private float locationLng;

    private String helpType;

    private String urgencyLevel;

    private String description;

    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
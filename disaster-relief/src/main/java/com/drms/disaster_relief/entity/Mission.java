package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Mission {

    private UUID missionId;

    private UUID requestId;

    private UUID cityId;

    private UUID branchId;

    private UUID createdBy;

    private String missionName;

    private String type;

    private String area;

    private float locationLat;

    private float locationLng;

    private String helpType;

    private String urgencyLevel;

    private String guidelines;

    private String status;

    private LocalDate expectedCompletionDate;

    private LocalDate actualCompletionDate;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
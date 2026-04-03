package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Logistics {

    private UUID logisticsId;

    private UUID branchId;

    private UUID addedBy;

    private String type;

    private String name;

    private String category;

    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
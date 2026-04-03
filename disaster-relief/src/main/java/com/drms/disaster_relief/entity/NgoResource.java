package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class NgoResource {

    private UUID resourceId;

    private UUID ngoId;

    private UUID cityId;

    private String name;

    private String category;

    private int quantity;

    private String unit;

    private String condition;

    private LocalDateTime createdAt;
}
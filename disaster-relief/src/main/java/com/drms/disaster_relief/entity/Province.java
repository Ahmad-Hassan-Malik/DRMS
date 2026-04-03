package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Province {

    private UUID provinceId;

    private String provinceName;

    private LocalDateTime createdAt;
}
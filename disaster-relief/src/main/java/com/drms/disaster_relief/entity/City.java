package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class City {

    private UUID cityId;

    private UUID provinceId;

    private String cityName;

    private LocalDateTime createdAt;
}
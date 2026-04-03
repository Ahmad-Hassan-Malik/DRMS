package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Branch {

    private UUID branchId;

    private UUID cityId;

    private String branchName;

    private String address;

    private String phoneNumber;

    private LocalDateTime createdAt;
}
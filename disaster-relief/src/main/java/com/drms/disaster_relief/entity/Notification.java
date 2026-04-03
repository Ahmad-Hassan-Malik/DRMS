package com.drms.disaster_relief.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Notification {

    private UUID notificationId;

    private UUID authId;

    private String title;

    private String message;

    private boolean isRead;

    private LocalDateTime createdAt;
}
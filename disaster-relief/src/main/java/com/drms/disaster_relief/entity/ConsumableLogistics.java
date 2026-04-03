package com.drms.disaster_relief.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
public class ConsumableLogistics extends Logistics {

    private int quantity;

    private String unit;

    private LocalDate expirationDate;
}
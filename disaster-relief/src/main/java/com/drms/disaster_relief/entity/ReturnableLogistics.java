package com.drms.disaster_relief.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ReturnableLogistics extends Logistics {

    private String uniqueIdentifier;

    private String condition;

    private String model;

    private int year;
}
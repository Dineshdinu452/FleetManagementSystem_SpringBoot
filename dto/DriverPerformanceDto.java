package com.example.Fleetmanagement.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@AllArgsConstructor
@Data
public class DriverPerformanceDto {

    private int id;
    @JsonProperty("driver_id")
    private int driverId;
    @JsonProperty("vehicle_id")
    private int vehicleId;
    @JsonProperty("fleet_id")
    private int fleetId;
    @JsonProperty("parameter")
    private String parameter;
    @JsonProperty("value")
    private String value;
    @JsonProperty("creation_timestamp")
    private Timestamp creationTimestamp;

//    private Date tripStartTime;
}

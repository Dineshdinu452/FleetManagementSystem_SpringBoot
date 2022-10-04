package com.example.Fleetmanagement.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FleetDto {

    private int id;
    @JsonProperty("vehicle_count")
    private int vehicleCount;
    private String route;
}

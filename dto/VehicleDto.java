package com.example.Fleetmanagement.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class VehicleDto {

    private int vehicleId;

    @JsonProperty("vehicle_registration_number")
    private String registrationNumber;

    @JsonProperty("vehicle_model")
    private String model;

    @JsonProperty("vehicle_class")
    private String classi;

    @JsonProperty("driver_id")
    private int driverId;

    @JsonProperty("fleet_id")
    private int fleetId;
}

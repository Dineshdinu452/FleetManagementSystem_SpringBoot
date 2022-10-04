package com.example.Fleetmanagement.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DriverDto {

    private int id;

    @JsonProperty("driver_name")
    private String driverName;

    private String address;

    @JsonProperty("license_number")
    private String licenseNumber;

    @JsonProperty("phone_number")
    private String phoneNumber;
}

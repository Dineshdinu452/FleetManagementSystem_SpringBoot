package com.example.Fleetmanagement.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private int vehicleId;

    @Column(name ="vehicle_registration_number")
    private String registrationNumber;

    @Column(name="vehicle_model")
    private String model;

    @Column(name = "vehicle_class")
    private String classi;
    
    @Column(name="driver_id")
    private int driverId;


    @Column(name="fleet_id")
    private int fleetId;
}


package com.example.Fleetmanagement.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(name = "driver_name")
    private String driverName;
    @Column
    private String address;
    @Column(name="license_number")
    private String licenseNumber;
    @Column(name="phone_number")
    private String phoneNumber;

}

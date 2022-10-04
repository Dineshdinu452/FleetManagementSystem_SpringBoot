package com.example.Fleetmanagement.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.Random;

@Data
@Entity
@Table(name="driverPerformance")
public class DriverPerformance {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="driver_id")
    private int driverId;

    @Column(name="vehicle_id")
    private int vehicleId;

    @Column(name = "fleet_id")
    private int fleetId;

//   @Column
//    private String value;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="trip_start_time")
    private Date tripStartTime= new Date(System.currentTimeMillis());


//   @Column(name="trip_end_time")
//    private Timestamp tripEndTime=new Timestamp(System.currentTimeMillis());
//
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="trip_end_time")
    private Date tripEndTime=new Date(System.currentTimeMillis());

    @Column(name="trip_distance")
    private double tripDistance= new Random().nextDouble(50+1);

    @Column(name = "average_speed")
    private double averageSpeed= new Random().nextDouble(10+1);

    @Column(name="initial_fuel_capacity")
    private double initialFuelCapacity  = 45 + (double) (new Random().nextFloat() * (65 - 45)); //here fuel capacity will ranges from 45 to65 liters

    @Column(name="final_fuel_capacity")
    private double finalFuelCapacity= 10 + (double) (new Random().nextFloat() * (44 - 10)); //here final capacity will ranges from 10 to 44

    @Column(name = "idle_time")
    private int idleTime=new Random().nextInt(5+1);

    @Column(name="is_seat_belt_buckled")
    private Boolean seatBelt=new Random().nextBoolean();

    @Column(name="traffic_violation")
    private boolean trafficVoilation=new Random().nextBoolean();

    @Override
    public String toString() {
        return "DriverPerformance{" +
                "id=" + id +
                ", driverId=" + driverId +
                ", vehicleId=" + vehicleId +
                ", fleetId=" + fleetId +
//                ", value='" + value + '\'' +
                ", tripStartTime=" + tripStartTime +
//                ", tripEndTime=" + tripEndTime +
                ", tripDistance=" + tripDistance +
                ", averageSpeed=" + averageSpeed +
                ", initialFuelCapacity=" + initialFuelCapacity +
                ", finalFuelCapacity=" + finalFuelCapacity +
                ", idleTime=" + idleTime +
                ", seatBelt=" + seatBelt +
                ", trafficVoilation=" + trafficVoilation +
                '}';
    }
}

package com.example.Fleetmanagement.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="fleet")
public class Fleet {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "vehicle_count")
    private int vehicleCount;
    @Column
    private String route;

    @Override
    public String toString() {
        return "Fleet{" +
                "id=" + id +
                ", vehicleCount=" + vehicleCount +
                ", route='" + route + '\'' +
                '}';
    }
}

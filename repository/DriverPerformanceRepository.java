package com.example.Fleetmanagement.repository;

import com.example.Fleetmanagement.entity.DriverPerformance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverPerformanceRepository extends CrudRepository<DriverPerformance,Integer> {

 List<DriverPerformance> findById(int fleetId);

// @Query(value = "select DriverPerformance.trip_distance as tripDistance from DriverPerformance where DriverPerformance.fleetId=:fleetId",nativeQuery = true)
 List<DriverPerformance> findByFleetId(int fleetId);

}

package com.example.Fleetmanagement.repository;

import com.example.Fleetmanagement.Projection.FleetProjectProjection;
import com.example.Fleetmanagement.entity.Fleet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FleetRepository extends CrudRepository<Fleet,Integer> {

    @Query(value ="select Fleet.id as id,Fleet.route as route, Vehicle.vehicle_id as vehicleId, Vehicle.vehicle_model as model, Vehicle.driver_id as driverId, Driver.driver_name as driverName from Fleet join Vehicle on Fleet.id=Vehicle.fleet_id join Driver on Driver.id= Vehicle.driver_id where Fleet.id=:id",nativeQuery = true)
    List<FleetProjectProjection> findVehicleByFleet(int id);
}

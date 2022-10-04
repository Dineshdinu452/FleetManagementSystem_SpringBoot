package com.example.Fleetmanagement.service;

import com.example.Fleetmanagement.dto.VehicleDto;
import com.example.Fleetmanagement.entity.Vehicle;
import com.example.Fleetmanagement.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public Vehicle saveVehicleToDb(VehicleDto vehicleDto) {
        Vehicle vehicle=new Vehicle();
        vehicle.setVehicleId(vehicleDto.getVehicleId());
        vehicle.setRegistrationNumber(vehicleDto.getRegistrationNumber());
        vehicle.setModel(vehicleDto.getModel());
        vehicle.setClassi(vehicleDto.getClassi());
        vehicle.setDriverId(vehicleDto.getDriverId());
        vehicle.setFleetId(vehicleDto.getFleetId());
        return vehicleRepository.save(vehicle);
    }
}

package com.example.Fleetmanagement.service;

import com.example.Fleetmanagement.Projection.FleetProjectProjection;
import com.example.Fleetmanagement.dto.FleetDto;
import com.example.Fleetmanagement.entity.Fleet;
import com.example.Fleetmanagement.repository.FleetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FleetService {

    @Autowired
    FleetRepository fleetRepository;

    //    here we are converting the dto content to entity

    public Fleet saveFleetToDb(FleetDto fleetDto) {
        Fleet fleet=new Fleet();
        fleet.setVehicleCount(fleetDto.getVehicleCount());
        fleet.setRoute(fleetDto.getRoute());

        return fleetRepository.save(fleet);
    }

    public List<FleetProjectProjection> getVehicleByFleet(int id) {
        List<FleetProjectProjection> fleet=fleetRepository.findVehicleByFleet(id);
        if(fleet!=null){
            return fleet;
        }
        else return null;
    }
}

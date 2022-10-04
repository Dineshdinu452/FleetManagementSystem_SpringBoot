package com.example.Fleetmanagement.controller;

import com.example.Fleetmanagement.Projection.FleetProjectProjection;
import com.example.Fleetmanagement.dto.DriverDto;
import com.example.Fleetmanagement.dto.DriverPerformanceDto;
import com.example.Fleetmanagement.dto.FleetDto;
import com.example.Fleetmanagement.dto.VehicleDto;
import com.example.Fleetmanagement.entity.Driver;
import com.example.Fleetmanagement.entity.DriverPerformance;
import com.example.Fleetmanagement.entity.Fleet;
import com.example.Fleetmanagement.entity.Vehicle;
import com.example.Fleetmanagement.service.DriverPerformanceService;
import com.example.Fleetmanagement.service.DriverService;
import com.example.Fleetmanagement.service.FleetService;
import com.example.Fleetmanagement.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FleetController {

    @Autowired
    FleetService fleetService;
    @Autowired
    DriverService driverService;
    @Autowired
    VehicleService vehicleService;
    @Autowired
    DriverPerformanceService driverPerformanceService;

    @PostMapping("/fleets")
    public Fleet saveFleet(@RequestBody FleetDto fleetDto){
        return fleetService.saveFleetToDb(fleetDto);

//         http://localhost:8080/fleets
    }

    @PostMapping("/drivers")
    public Driver saveDrivers(@RequestBody DriverDto driverDto){
        return driverService.saveDriversToDb(driverDto);

//         http://localhost:8080/drivers
    }

    @PostMapping( "/vehicles")
    public Vehicle saveVehicle(@RequestBody VehicleDto vehicleDto){
        return vehicleService.saveVehicleToDb(vehicleDto);

//         http://localhost:8080/vehicles
    }

//    @PostMapping(" /fleets/simulate")
//    public DriverPerformance saveDriverPerformance(@RequestBody DriverPerformanceDto driverPerformanceDto){
//        return driverPerformanceService.savePerformanceToDb(driverPerformanceDto);
//    }

    @GetMapping("/fleets/{id}")
    public ResponseEntity<Object>findByFleet(@PathVariable(value ="id")int id){
        List<FleetProjectProjection> fleet=fleetService.getVehicleByFleet(id);

        if(fleet==null){
            return new ResponseEntity<>("No fleet found", HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(fleet,HttpStatus.OK);
        }
        //     http://localhost:8080/fleets/1
    }


//    @GetMapping("/fleets/simulate")
//    public List<DriverPerformance> getDriverPerformance(){
//        return driverPerformanceService.findDriverPerformance();
//    }

    @PostMapping("/save/fleets/simulate")
    public DriverPerformance saveDriverPerformance(@RequestBody DriverPerformanceDto driverPerformanceDto){
        return driverPerformanceService.savePerformanceToDb(driverPerformanceDto);
    }


    @GetMapping("/fleets/simulate/{fleet_id}")
    public ResponseEntity<Object>getDriverPerformance(@PathVariable(value ="fleet_id") int fleetId){
        List<DriverPerformance> driverPerformance=driverPerformanceService.findDriverPerformance(fleetId);

        if(driverPerformance==null){
            return new ResponseEntity<>("No fleet found", HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(driverPerformance,HttpStatus.OK);
        }
    }
}




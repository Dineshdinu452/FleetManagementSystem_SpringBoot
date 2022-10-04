package com.example.Fleetmanagement.service;

import com.example.Fleetmanagement.dto.DriverPerformanceDto;
import com.example.Fleetmanagement.entity.DriverPerformance;
import com.example.Fleetmanagement.repository.DriverPerformanceRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DriverPerformanceService {
    private static final org.slf4j.Logger LOGGER = LoggerFactory
            .getLogger(DriverPerformanceService.class);

    @Autowired
    DriverPerformanceRepository driverPerformanceRepository;

    public List<DriverPerformance> findDriverPerformance(int fleetId) {

        List<DriverPerformance>driverPerformance=driverPerformanceRepository.findByFleetId(fleetId);
        if(driverPerformance!=null){
            return driverPerformance;
        }
        else return null;
//        return driverPerformanceRepository.findById(fleetId);
    }

    public DriverPerformance savePerformanceToDb(DriverPerformanceDto driverPerformanceDto) {

        DriverPerformance driverPerformance = new DriverPerformance();
//        driverPerformance.setId(driverPerformanceDto.getId());
        driverPerformance.setDriverId(driverPerformanceDto.getDriverId());
        driverPerformance.setVehicleId(driverPerformanceDto.getVehicleId());
        driverPerformance.setFleetId(driverPerformanceDto.getFleetId());
        return driverPerformanceRepository.save(driverPerformance);
    }
}


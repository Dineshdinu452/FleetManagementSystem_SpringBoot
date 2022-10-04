package com.example.Fleetmanagement.service;

import com.example.Fleetmanagement.dto.DriverDto;
import com.example.Fleetmanagement.entity.Driver;
import com.example.Fleetmanagement.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;

    public Driver saveDriversToDb(DriverDto driverDto) {

        Driver driver=new Driver();
        driver.setDriverName(driverDto.getDriverName());
        driver.setAddress(driverDto.getAddress());
        driver.setLicenseNumber(driverDto.getLicenseNumber());
        driver.setPhoneNumber(driverDto.getPhoneNumber());

        return driverRepository.save(driver);

    }
}

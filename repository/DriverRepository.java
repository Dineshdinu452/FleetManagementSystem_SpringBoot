package com.example.Fleetmanagement.repository;

import com.example.Fleetmanagement.entity.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DriverRepository extends CrudRepository<Driver,Integer> {
}

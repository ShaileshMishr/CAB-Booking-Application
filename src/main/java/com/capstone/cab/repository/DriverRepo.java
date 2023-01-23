package com.capstone.cab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.cab.model.Driver;

@Repository
public interface DriverRepo extends JpaRepository<Driver, Integer>{

}

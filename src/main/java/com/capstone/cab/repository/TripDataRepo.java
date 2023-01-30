package com.capstone.cab.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capstone.cab.model.TripDetails;


public interface TripDataRepo extends JpaRepository<TripDetails, Integer>{

	void save(Integer tripBookedId);

	
}

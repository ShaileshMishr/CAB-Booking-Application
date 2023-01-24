package com.capstone.cab.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capstone.cab.model.TripDetails;


public interface TripDataRepo extends JpaRepository<TripDetails, Integer>{

	public List<TripDetails> findByCarType(String carType);

	public List<TripDetails> findByDate(LocalDate ld);
	
	@Query("select t from TripDetails t where t.date between ?1 and ?2 ")
	public List<TripDetails> getAllTripsForDays(LocalDate fromDate ,LocalDate toDate);
}

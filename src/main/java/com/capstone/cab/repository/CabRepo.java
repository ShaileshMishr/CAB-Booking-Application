package com.capstone.cab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capstone.cab.model.Cab;
import com.capstone.cab.model.Customer;

public interface CabRepo extends JpaRepository<Cab, Integer>{

	public List<Cab> findByCarType(String carType);
	
	@Query("select count(cab.carType) from Cab cab where cab.carType=?1")
	public int getcount(String carType);

	public void save(Customer cust);
}

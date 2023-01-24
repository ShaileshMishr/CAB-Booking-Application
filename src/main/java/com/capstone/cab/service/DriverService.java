package com.capstone.cab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.cab.model.Driver;
import com.capstone.cab.repository.DriverRepo;

@Service
public class DriverService {

	@Autowired
	DriverRepo drirepo;
	
public List<Driver> getDrivers(){
		
		List<Driver> dri = (List<Driver>)drirepo.findAll();
		return dri;
	}
	
	public void saveDriver(Driver driv) {
		drirepo.save(driv);
	}
	
	public int getDriverId(String userName, String password) {
		List<Driver> dri = (List<Driver>)drirepo.findAll();
		int driverid = 0;
		for(Driver dr: dri) {
			if(dr.getUserName().equals(userName) && dr.getPassword().equals(password))
			{
				driverid=dr.getDriverId();
			}
		}
		return driverid;
		}
	
	
	// Insert Driver
	
		public void save(Driver driver) {
			drirepo.save(driver);
		}
		
		 //### GET Driver BY ID ###
		public Driver getDriver(int driverId) {
			return drirepo.findById(driverId).get();
		}
		
		//### DELETE Driver ###
		
		public void deleteDriver(int driverId) {
			drirepo.deleteById(driverId);
			
		}
		
}

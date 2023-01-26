package com.capstone.cab.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.cab.model.Customer;
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
		
		//### Update Driver ###

		
		public boolean saveDrivers1(Driver dri) {
			Driver c1 = drirepo.save(dri);
			if(c1 != null)
				return true;
			else {
				return false;
			}
		}
		
		   //View Best Driver only with rating >=4.5
	    public List<Driver> viewBestDrivers() {
	        List<Driver> allDrivers = getDrivers();
	        List<Driver> bestDrivers = allDrivers.stream().filter(driver -> {
	                            if (driver.isAvailable() && driver.getRating() != null && Float.compare(driver.getRating(), 4.5f) >= 0) {
	                                return true;
	                            }
	                            return false;
	                        }
	                ).
	                collect(Collectors.toList());
	        return bestDrivers;
	    }
	
}

package com.capstone.cab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.cab.model.Admin;
import com.capstone.cab.model.Customer;
import com.capstone.cab.model.Driver;
import com.capstone.cab.repository.AdminRepo;
import com.capstone.cab.repository.CustomerRepo;
import com.capstone.cab.repository.DriverRepo;


@Service
public class LoginService {

	@Autowired
	CustomerRepo repository;
	@Autowired
	DriverRepo drepository;
	@Autowired
	AdminRepo arepository;
	
	public boolean validateCustomer(String userName, String password) {
		
		List<Customer> cust = (List<Customer>)repository.findAll();
		boolean isValid = false;
		for(Customer cus: cust) {
			if(cus.getUserName().equalsIgnoreCase(userName) && cus.getPassword().equalsIgnoreCase(password)) {
				
				isValid = true;
			}
			
		}
		return isValid;
		
		
	}
	
public boolean validateDriver(String userName, String password) {
		
		List<Driver> driv = (List<Driver>)drepository.findAll();
		boolean isValid1 = false;
		for(Driver dri: driv) {
			if(dri.getUserName().equalsIgnoreCase(userName) && dri.getPassword().equalsIgnoreCase(password)) {
				
				isValid1 = true;
			}
			
		}
		return isValid1;
		
		
	}
	
public boolean validateAdmin(String userName, String password) {
	
	List<Admin> adm = (List<Admin>)arepository.findAll();
	boolean isValid2 = false;
	for(Admin ad: adm) {
		if(ad.getUserName().equalsIgnoreCase(userName) && ad.getPassword().equalsIgnoreCase(password)) {
			
			isValid2 = true;
		}
		
	}
	return isValid2;
	
	
}

	
}

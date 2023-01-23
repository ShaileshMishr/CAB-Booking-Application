package com.capstone.cab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.cab.model.Customer;
import com.capstone.cab.repository.CustomerRepo;



@Service
public class CustomerService {
	
	@Autowired 
	CustomerRepo cusrepo;
	
	public List<Customer> getCustomers(){
		
		List<Customer> cus = (List<Customer>)cusrepo.findAll();
		return cus;
	}
	
	public void saveUser(Customer cust) {
		cusrepo.save(cust);
	}
	
	public int getCustomerId(String userName, String password) {
		List<Customer> cus = (List<Customer>)cusrepo.findAll();
		int customerid = 0;
		for(Customer cs: cus) {
			if(cs.getUserName().equals(userName) && cs.getPassword().equals(password))
			{
				customerid=cs.getCustomerId();
			}
		}
		return customerid;
		}

}

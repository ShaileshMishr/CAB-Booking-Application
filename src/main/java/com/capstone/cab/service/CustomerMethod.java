package com.capstone.cab.service;

import java.util.List;

import com.capstone.cab.exceptions.CustomerException;
import com.capstone.cab.model.Customer;

public interface CustomerMethod {
	
	boolean  insertCustomer(Customer customer) throws CustomerException;
	
	// boolean updateCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);
	
	public Customer deleteCustomer(Integer customerId);
//	
//	public List<Customer> getAllCustomers();
//	
//	public Customer getCustomerById(Integer customerId);

}

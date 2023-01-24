package com.capstone.cab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.cab.exceptions.CustomerException;
import com.capstone.cab.model.Customer;
import com.capstone.cab.repository.CustomerRepo;


@Service
public class CustomerService implements CustomerMethod {
	
	@Autowired 
	CustomerRepo cusrepo;
	
	public List<Customer> getCustomers(){
		
		List<Customer> cus = (List<Customer>)cusrepo.findAll();
		return cus;
	}
	
	public void saveCustomers(Customer cust) {
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

		
	
	//### INSERT CUSTOMER ###
	   @Override
		public boolean insertCustomer(Customer customer) throws CustomerException {
			// TODO Auto-generated method stub

			
			Customer c1 = cusrepo.save(customer);
			if(c1 != null)
				return true;
			else {
				return false;
			}
		}

	   //### GET CUSTOMER ###
	   
	   public List<Customer> listUsers(){
			return cusrepo.findAll();
		}
		
	   
	   //### GET CUSTOMER BY ID ###
		public Customer getCustomer(int customerId) {
			return cusrepo.findById(customerId).get();
		}
		
		
		//### DELETE CUSTOMER ###

		@Override
		public Customer deleteCustomer(Integer customerId) {
			Optional<Customer> optional = cusrepo.findById(customerId);

			if (optional.isPresent()) {

				Customer existingCustomer = optional.get();

				cusrepo.delete(existingCustomer);


				return existingCustomer;
		}else {
		}
			return null;
}

		
		//UPDATE CUSTOMER
		
		@Override
		public Customer updateCustomer(Customer customer) {
			//cusrepo.findById(customer.getCustomerId());
			return cusrepo.save(customer);
		}
		
		
//	public boolean updateCustomer(Customer customer) {
//	
//		cusrepo.findById(customerId).get();
//		
//		Customer c1 = cusrepo.save(customer);
//		if(c1 != null)
//			return true;
//		else {
//			return false;
//		}
//	}
}

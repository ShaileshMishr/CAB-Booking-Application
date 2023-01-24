package com.capstone.cab.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.cab.model.Customer;

@Repository

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	//boolean updateCustomer(Customer customer);



}

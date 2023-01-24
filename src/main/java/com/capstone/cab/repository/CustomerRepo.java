package com.capstone.cab.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.cab.model.Customer;

@Repository

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

//	@Query("select c from Customer c where c.userName=?6 AND c.password=?5")
//	public Customer getCustomerByUsernameAndpassword(String userName, String password);

}

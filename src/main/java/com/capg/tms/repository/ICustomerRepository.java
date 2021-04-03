package com.capg.tms.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.capg.tms.entities.Customer;


public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

	
	
	
	
}

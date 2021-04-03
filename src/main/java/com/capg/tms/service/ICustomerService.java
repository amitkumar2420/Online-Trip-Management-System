package com.capg.tms.service;

import java.util.List;

import com.capg.tms.entities.Customer;
import com.capg.tms.exceptions.CustomerNotFoundException;
import com.capg.tms.exceptions.PackageNotFoundException;
import com.capg.tms.exceptions.RouteNotFoundException;
import com.capg.tms.model.CustomerDTO;

public interface ICustomerService {

	public CustomerDTO addCustomer(Customer customer);
	public CustomerDTO updateCustomer(Customer customer) throws CustomerNotFoundException;
	public CustomerDTO deleteCustomer(Customer customer) throws CustomerNotFoundException;
	public CustomerDTO viewCustomer(int custid) throws CustomerNotFoundException;
	public List<CustomerDTO> viewAllCustomers(int packageId)throws PackageNotFoundException;
	public List<CustomerDTO> viewCustomerList(int routeId)throws RouteNotFoundException;

	
	
	
}

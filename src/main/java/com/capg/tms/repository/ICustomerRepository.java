package com.capg.tms.repository;

import java.util.List;

import com.capg.tms.entities.Customer;
import com.capg.tms.exceptions.CustomerNotFoundException;
import com.capg.tms.exceptions.PackageNotFoundException;
import com.capg.tms.exceptions.RouteNotFoundException;

public interface ICustomerRepository {

	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer deleteCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer viewCustomer(int custid) throws CustomerNotFoundException;
	public List<Customer> viewAllCustomers(int packageId)throws PackageNotFoundException;
	public List<Customer> viewCustomerList(int routeId)throws RouteNotFoundException;

	
	
	
}

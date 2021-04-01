package com.capg.service;

import java.util.List;
import com.capg.entities.Customer;
import com.capg.exceptions.CustomerNotFoundException;
import com.capg.exceptions.PackageNotFoundException;
import com.capg.exceptions.RouteNotFoundException;

public interface ICustomerService {

	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer deleteCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer viewCustomer(int custid) throws CustomerNotFoundException;
	public List<Customer> viewAllCustomers(int packageId)throws PackageNotFoundException;
	public List<Customer> viewCustomerList(int routeId)throws RouteNotFoundException;

	
	
	
}

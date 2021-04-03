package com.capg.tms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.tms.entities.Customer;
import com.capg.tms.exceptions.CustomerNotFoundException;
import com.capg.tms.exceptions.PackageNotFoundException;
import com.capg.tms.exceptions.RouteNotFoundException;
import com.capg.tms.model.CustomerDTO;
@Service
public class CustomerServiceImpl implements ICustomerService {

	@Override
	public CustomerDTO addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO updateCustomer(Customer customer) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO deleteCustomer(Customer customer) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO viewCustomer(int custid) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> viewAllCustomers(int packageId) throws PackageNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> viewCustomerList(int routeId) throws RouteNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}

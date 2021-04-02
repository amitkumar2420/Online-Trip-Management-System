package com.capg.tms.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.tms.entities.Customer;

import com.capg.tms.model.CustomerDTO;

public class CustomerUtils {
	
	public static List<CustomerDTO> convertToCustomerDTOList(List<Customer> list)
	{
		
		
		List<CustomerDTO> dtolist = new ArrayList<CustomerDTO>();
		for(Customer customer : list)
		dtolist.add(convertToCustomerDto(customer));
		return dtolist;
		
	}
	
	public static Customer convertToCustomer(CustomerDTO dto)
	{
		Customer customer = new Customer();
		customer.setCustomerId(dto.getCustomerId());
		customer.setCustomerName(dto.getCustomerName());
		customer.setCustomerPassword(dto.getCustomerPassword());
		customer.setAddress(dto.getAddress());
		customer.setMobileNo(dto.getMobileNo());
		customer.setEmail(dto.getEmail());
		return customer;
		
	}
	
	public static CustomerDTO convertToCustomerDto(Customer customer) {
		CustomerDTO dto = new CustomerDTO();
		dto.setCustomerId(customer.getCustomerId());
		dto.setCustomerName(customer.getCustomerName());
		dto.setCustomerPassword(customer.getCustomerPassword());
		dto.setAddress(customer.getAddress());
		dto.setMobileNo(customer.getMobileNo());
		dto.setEmail(customer.getEmail());
		return dto;
	}
	
	

}

package com.capg.tms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer {
	@Id
	private  int customerId;
	private String customerName;
	private String  customerPassword;
	private String address;
	private String mobileNo;
	private String email;

}

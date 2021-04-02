package com.capg.tms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int customerId;
	private String customerName;
	private String  customerPassword;
	private String address;
	private String mobileNo;
	private String email;

}

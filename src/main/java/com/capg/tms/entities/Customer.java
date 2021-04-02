package com.capg.tms.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;


@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int customerId;
	
	@NotNull       
	@Column(name = "customer_name",nullable = false,length = 25)
	private String customerName;
	
	@NotNull     
	@Column(name = "pass_word",nullable = false,length = 15)
	private String  customerPassword;
	
	@NotNull     
	@Column(name = "addr",nullable = false,length = 100)
	private String address;
	
	@NotNull       
	@Column(name = "mobile_no.",nullable = false,length = 10)
	private String mobileNo;
	
	@NotNull     
	@Column(name = "e_mail",nullable = false,length = 50)
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id",table = "User")
	private User user;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, String customerPassword, String address, String mobileNo,
			String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.address = address;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPassword="
				+ customerPassword + ", address=" + address + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}

}

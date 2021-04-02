package com.capg.tms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userType;
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userType, String password) {
		super();
		this.userId = userId;
		this.userType = userType;
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userType=" + userType + ", password=" + password + "]";
	}
	

}

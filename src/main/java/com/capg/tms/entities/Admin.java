package com.capg.tms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

@Entity
	public class Admin {
		
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
		private int  adminId;
	
	@NotNull
    @Column(name = "name",nullable = false,length = 50)
		private String adminName;
	
	 @NotNull
	 @Column(name = "pass_word",nullable = false,length = 10)
	    private String password;
	 
	 @NotNull
	 @Column(name = "email",nullable = false,unique = true,length = 50)
		private String email;
	
	 @NotNull
	 @Column(name = "contact_no",nullable = false,unique = true,length = 50)
		private  String mobile;
	 
	 
	@OneToOne()
	@JoinColumn(name="report_id",referencedColumnName = "reportId")
	private Report report;
	
		public Admin() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Admin(int adminId, String adminName, String password, String email, String mobile) {
			super();
			this.adminId = adminId;
			this.adminName = adminName;
			this.password = password;
			this.email = email;
			this.mobile = mobile;
		}
		public int getAdminId() {
			return adminId;
		}
		public void setAdminId(int adminId) {
			this.adminId = adminId;
		}
		public String getAdminName() {
			return adminName;
		}
		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		@Override
		public String toString() {
			return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", password=" + password + ", email="
					+ email + ", mobile=" + mobile + "]";
		}
		
		
		
		
		

	}


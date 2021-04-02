package com.capg.tms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class Admin {
		
		@Id
		private int  adminId;
		private String adminName;
		private  String password;
		private String email;
		private  String mobile;
		
		
		
		

	}


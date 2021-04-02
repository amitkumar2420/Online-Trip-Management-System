package com.capg.tms.model;
import org.springframework.stereotype.Component;

@Component


	public class AdminDTO {
		 
		
		private int  adminId;
		private String adminName;
		private  String password;
		private String email;
		private  String mobile;
		public AdminDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		public AdminDTO(int adminId, String adminName, String password, String email, String mobile) {
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
			return "AdminDTO [adminId=" + adminId + ", adminName=" + adminName + ", password=" + password + ", email="
					+ email + ", mobile=" + mobile + "]";
		}
		
		
		
		
		

	}


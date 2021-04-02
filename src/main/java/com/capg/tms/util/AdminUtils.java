package com.capg.tms.util;

import java.util.ArrayList;
import java.util.List;
import com.capg.tms.entities.Admin;
import com.capg.tms.model.AdminDTO;

public  class AdminUtils {
		
		public static List<AdminDTO> convertToAdminDTOList(List<Admin> list)
		{
			List<AdminDTO> dtolist = new ArrayList<AdminDTO>();
			for(Admin admin : list)
				dtolist.add(convertToAdminDto(admin));
			return dtolist;
			
		}
		
		public static Admin convertToAdmin(AdminDTO dto)
		{
			Admin admin = new Admin();
			admin.setAdminId(dto.getAdminId());
			admin.setPassword(dto.getPassword());
			return admin;
		}
		
		public static AdminDTO convertToAdminDto(Admin admin) {
			AdminDTO dto = new AdminDTO();
			dto.setAdminId(admin.getAdminId());
			dto.setPassword(admin.getPassword());
			return dto;
		}
		
		

	}


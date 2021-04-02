package com.capg.tms.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.tms.entities.User;
import com.capg.tms.model.UserDTO;


  
public class UserUtils

{
	public static List<UserDTO> convertToUserDTOList(List<User> list)
	{
		List<UserDTO> dtolist = new ArrayList<UserDTO>();
		for(User user : list)
		dtolist.add(convertToUserDto(user));
		return dtolist;
		
	}
	
	public static User convertToAdmin(UserDTO dto)
	{
		User user = new User();
		user.setUserId(dto.getUserId());
		user.setUserType(dto.getUserType());
		user.setPassword(dto.getPassword());
		
		return user;
	}
	
	public static UserDTO convertToUserDto(User user) {
		UserDTO dto = new UserDTO();
		dto.setUserId(user.getUserId());
		dto.setPassword(user.getPassword());
		dto.setUserType(user.getUserType());
		return dto;
	}
	
	
}

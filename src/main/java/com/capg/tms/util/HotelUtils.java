package com.capg.tms.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.tms.entities.Hotel;
import com.capg.tms.model.HotelDTO;



public class HotelUtils
{
	public static List<HotelDTO> convertToHotelDTOList(List<Hotel> list)
	{
		List<HotelDTO> dtolist = new ArrayList<HotelDTO>();
		for(Hotel hotel : list)
		dtolist.add(convertToHotelDto(hotel));
		return dtolist;
	}
	
	public static Hotel convertToHotel(HotelDTO dto)
	{
		Hotel hotel = new Hotel();
		hotel.setHotelId(dto.getHotelId());
		hotel.setHotelName(dto.getHotelName());
		hotel.setHotelType(dto.getHotelType());
		hotel.setHotelDescription(dto.getHotelDescription());
		hotel.setAddress(dto.getAddress());
		hotel.setRent(dto.getRent());
		hotel.setStatus(dto.getStatus());
		return hotel;
	}
	
	public static HotelDTO convertToHotelDto(Hotel hotel) {
		HotelDTO dto = new HotelDTO();
		dto.setHotelId(hotel.getHotelId());
		dto.setHotelName(hotel.getHotelName());
		dto.setHotelType(hotel.getHotelType());
		dto.setHotelDescription(hotel.getHotelDescription());
		dto.setAddress(hotel.getAddress());
		dto.setRent(hotel.getRent());
		dto.setStatus(hotel.getStatus());
		return dto;
	}
	
}

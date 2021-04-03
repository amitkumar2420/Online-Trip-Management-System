package com.capg.tms.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.tms.entities.Booking;

import com.capg.tms.model.BookingDTO;

public class BookingUtils {

	
	public static List<BookingDTO> convertToBookingDTOList(List<Booking> list)
	{
		List<BookingDTO> dtolist = new ArrayList<BookingDTO>();
		for(Booking booking : list)
		dtolist.add(convertToBookingDto(booking));
		return dtolist;
		
	}
	public static Booking convertToBooking(BookingDTO dto)
	{
		Booking booking = new Booking();
		booking.setBookingId(dto.getBookingId());
		booking.setBookingType(dto.getBookingType());
		booking.setDescription(dto.getDescription());
		booking.setBookingTitle(dto.getBookingTitle());
		booking.setBookingDate(dto.getBookingDate());
		return booking;
	}
	
	public static BookingDTO convertToBookingDto(Booking booking) {
		BookingDTO dto = new BookingDTO();
		dto.setBookingId(booking.getBookingId());
		dto.setBookingType(booking.getBookingType());
		dto.setDescription(booking.getDescription());
		dto.setBookingTitle(booking.getBookingTitle());
		dto.setBookingDate(booking.getBookingDate());
		return dto;
	}
	
	

}

package com.capg.tms.service;

import java.util.List;

import com.capg.tms.entities.Booking;
import com.capg.tms.exceptions.BookingNotFoundException;
import com.capg.tms.model.BookingDTO;

public interface IBookingService {
	
	
	public  BookingDTO  makeBooking(Booking booking);
	public  BookingDTO  cancelBooking(int bookingId) throws BookingNotFoundException;
	public  BookingDTO  viewBooking(int bookingId)throws BookingNotFoundException;
	public List<BookingDTO> viewAllBookings();
	
	
	
	
	

}

package com.capg.tms.service;

import java.util.List;

import com.capg.tms.entities.Booking;
import com.capg.tms.exceptions.BookingNotFoundException;

public interface IBookingService {
	
	
	public  Booking  makeBooking(Booking booking);
	public  Booking  cancelBooking(int bookingId) throws BookingNotFoundException;
	public  Booking  viewBooking(int bookingId)throws BookingNotFoundException;
	public List<Booking> viewAllBookings();
	
	
	
	
	

}

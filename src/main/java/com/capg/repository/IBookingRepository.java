package com.capg.repository;

import java.util.List;
import com.capg.entities.Booking;
import com.capg.exceptions.BookingNotFoundException;


public interface IBookingRepository {
	
	
	public  Booking  makeBooking(Booking booking);
	public  Booking  cancelBooking(int bookingId) throws BookingNotFoundException;
	public  Booking  viewBooking(int bookingId)throws BookingNotFoundException;
	public List<Booking> viewAllBookings();
}

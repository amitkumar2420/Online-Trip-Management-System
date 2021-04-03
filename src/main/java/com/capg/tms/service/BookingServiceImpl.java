package com.capg.tms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.tms.entities.Booking;
import com.capg.tms.exceptions.BookingNotFoundException;
import com.capg.tms.model.BookingDTO;
import com.capg.tms.repository.IBookingRepository;
import com.capg.tms.util.BookingUtils;

public class BookingServiceImpl implements IBookingService {
@Autowired
IBookingRepository bookingRepo;
	@Override
	public BookingDTO makeBooking(Booking booking) {
		Booking bookingEntity =  bookingRepo.save(booking);
		return BookingUtils.convertToBookingDto(bookingEntity);
		
	}

	@Override
	public BookingDTO cancelBooking(int bookingId) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookingDTO viewBooking(int bookingId) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookingDTO> viewAllBookings() {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.capg.tms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.tms.entities.Booking;


public interface IBookingRepository extends JpaRepository<Booking,Integer>{
	
	
	
}

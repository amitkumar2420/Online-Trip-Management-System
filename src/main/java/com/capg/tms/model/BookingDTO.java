package com.capg.tms.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
@Component
public class BookingDTO {
	
	private int bookingId;
	private String bookingType;
	private String description;
	private String bookingTitle;
	private  LocalDate bookingDate;
	private PackageDTO pack;
	private  int userId;
	
	

}

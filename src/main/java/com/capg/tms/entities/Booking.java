package com.capg.tms.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingId;
	private String bookingType;
	private String description;
	private String bookingTitle;
	private  LocalDate bookingDate;
	private Package pack;
	private  int userId;
	
	
	
	

}

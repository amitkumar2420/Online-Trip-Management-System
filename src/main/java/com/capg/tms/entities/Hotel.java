package com.capg.tms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel
{
	@Id
	private int hotelId;
	private String hotelName;
	private String hotelType;
	private String hotelDescription;
	private String address;
	private double rent;
	private String status;
}

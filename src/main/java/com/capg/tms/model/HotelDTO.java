package com.capg.tms.model;

import org.springframework.stereotype.Component;

@Component
public class HotelDTO
{
	private int hotelId;
	private String hotelName;
	private String hotelType;
	private String hotelDescription;
	private String address;
	private double rent;
	private String status;
}

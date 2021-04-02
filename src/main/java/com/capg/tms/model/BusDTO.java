package com.capg.tms.model;

import org.springframework.stereotype.Component;

@Component
public class BusDTO {
	
	private int busId;
	private  String busType;
	private  String busNumber;
	private int capacity;
	private TravelsDTO travel;

}

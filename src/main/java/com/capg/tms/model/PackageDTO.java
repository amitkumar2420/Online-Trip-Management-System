package com.capg.tms.model;

import org.springframework.stereotype.Component;

@Component
public class PackageDTO {
	
	private int packageId;
	private String packageName;
	private String packageDescription;
	private String packageType;
	private double packageCost;
	private  PaymentDetailsDTO  payment;
	private TicketDetailsDTO ticket;
	private HotelDTO hotel;

}

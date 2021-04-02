package com.capg.tms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Package {
	@Id
	private int packageId;
	private String packageName;
	private String packageDescription;
	private String packageType;
	private double packageCost;
	private  PaymentDetails  payment;
	private TicketDetails ticket;
	private Hotel hotel;

}

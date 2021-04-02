package com.capg.tms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Package {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int packageId;
	private String packageName;
	private String packageDescription;
	private String packageType;
	private double packageCost;
	private  PaymentDetails  payment;
	private TicketDetails ticket;
	private Hotel hotel;

}

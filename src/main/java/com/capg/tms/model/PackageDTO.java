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
	public PackageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PackageDTO(int packageId, String packageName, String packageDescription, String packageType,
			double packageCost, PaymentDetailsDTO payment, TicketDetailsDTO ticket, HotelDTO hotel) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.packageDescription = packageDescription;
		this.packageType = packageType;
		this.packageCost = packageCost;
		this.payment = payment;
		this.ticket = ticket;
		this.hotel = hotel;
	}
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getPackageDescription() {
		return packageDescription;
	}
	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public double getPackageCost() {
		return packageCost;
	}
	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}
	public PaymentDetailsDTO getPayment() {
		return payment;
	}
	public void setPayment(PaymentDetailsDTO payment) {
		this.payment = payment;
	}
	public TicketDetailsDTO getTicket() {
		return ticket;
	}
	public void setTicket(TicketDetailsDTO ticket) {
		this.ticket = ticket;
	}
	public HotelDTO getHotel() {
		return hotel;
	}
	public void setHotel(HotelDTO hotel) {
		this.hotel = hotel;
	}
	@Override
	public String toString() {
		return "PackageDTO [packageId=" + packageId + ", packageName=" + packageName + ", packageDescription="
				+ packageDescription + ", packageType=" + packageType + ", packageCost=" + packageCost + ", payment="
				+ payment + ", ticket=" + ticket + ", hotel=" + hotel + "]";
	}
	
			

}

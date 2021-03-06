package com.capg.tms.model;

import org.springframework.stereotype.Component;

import com.capg.tms.entities.Hotel;
import com.capg.tms.entities.PaymentDetails;
import com.capg.tms.entities.TicketDetails;

@Component
public class PackageDTO {
	
	private int packageId;
	private String packageName;
	private String packageDescription;
	private String packageType;
	private double packageCost;
	private  PaymentDetails  payment;
	private TicketDetails ticket;
	private Hotel hotel;
	
	
	public PackageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PackageDTO(int packageId, String packageName, String packageDescription, String packageType,
			double packageCost, PaymentDetails payment, TicketDetails ticket, Hotel hotel) {
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
	public PaymentDetails getPayment() {
		return payment;
	}
	public void setPayment(PaymentDetails payment) {
		this.payment = payment;
	}
	public TicketDetails getTicket() {
		return ticket;
	}
	public void setTicket(TicketDetails ticket) {
		this.ticket = ticket;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	@Override
	public String toString() {
		return "PackageDTO [packageId=" + packageId + ", packageName=" + packageName + ", packageDescription="
				+ packageDescription + ", packageType=" + packageType + ", packageCost=" + packageCost + ", payment="
				+ payment + ", ticket=" + ticket + ", hotel=" + hotel + "]";
	}
	
			

}

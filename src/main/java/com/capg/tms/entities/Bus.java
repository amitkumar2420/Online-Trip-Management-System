package com.capg.tms.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity
public class Bus {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int busId;
	
	
	@Column(name="Bus Type",nullable=false)
	private  String busType;
	
	
	@Column(name="Bus Number",nullable=false,unique=true,length=20)
	private  String busNumber;
	
	
	@Column(name="Capacity",nullable=false)
	private int capacity;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="travels_id", table="Travels")
	private Travels travel;
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(int busId, String busType, String busNumber, int capacity, Travels travel) {
		super();
		this.busId = busId;
		this.busType = busType;
		this.busNumber = busNumber;
		this.capacity = capacity;
		this.travel = travel;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Travels getTravel() {
		return travel;
	}
	public void setTravel(Travels travel) {
		this.travel = travel;
	   }
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busType=" + busType + ", busNumber=" + busNumber + ", capacity=" + capacity
				+ ", travel=" + travel + "]";
	}

}

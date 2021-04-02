package com.capg.tms.model;

import org.springframework.stereotype.Component;

@Component
public class BusDTO {
	
	private int busId;
	private  String busType;
	private  String busNumber;
	private int capacity;
	private TravelsDTO travel;
	public BusDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BusDTO(int busId, String busType, String busNumber, int capacity, TravelsDTO travel) {
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
	public TravelsDTO getTravel() {
		return travel;
	}
	public void setTravel(TravelsDTO travel) {
		this.travel = travel;
	}
	@Override
	public String toString() {
		return "BusDTO [busId=" + busId + ", busType=" + busType + ", busNumber=" + busNumber + ", capacity=" + capacity
				+ ", travel=" + travel + "]";
	}
	

}

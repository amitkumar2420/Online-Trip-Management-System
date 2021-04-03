package com.capg.tms.model;

import org.springframework.stereotype.Component;

import com.capg.tms.entities.Route;

@Component
public class TicketDetailsDTO {
	
	private String ticketId;
	private Route route;
	private String status;
	
	public TicketDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketDetailsDTO(String ticketId, Route route, String status) {
		super();
		this.ticketId = ticketId;
		this.route = route;
		this.status = status;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TicketDetailsDTO [ticketId=" + ticketId + ", route=" + route + ", status=" + status + "]";
	}
	
	
	
	
	

}
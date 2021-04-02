package com.capg.tms.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class TicketDetailsDTO {
	
	private String ticketId;
	private RouteDTO route;
	private String status;
	public TicketDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketDetailsDTO(String ticketId, RouteDTO route, String status) {
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
	public RouteDTO getRoute() {
		return route;
	}
	public void setRoute(RouteDTO route) {
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
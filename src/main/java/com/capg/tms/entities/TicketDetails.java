package com.capg.tms.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class TicketDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String ticketId;
	private String status;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="routeid",table = "route")
	private Route route;
	
	public TicketDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketDetails(String ticketId, Route route, String status) {
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
		return "TicketDetails [ticketId=" + ticketId + ", route=" + route + ", status=" + status + "]";
	}
	
	
	
	
	

}
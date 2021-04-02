package com.capg.tms.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class TicketDetails {
	@Id
	private String ticketId;
	private Route route;
	private String status;
	
	
	
	

}
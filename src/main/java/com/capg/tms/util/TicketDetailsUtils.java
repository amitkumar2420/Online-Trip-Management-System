package com.capg.tms.util;

import java.util.ArrayList;
import java.util.List;


import com.capg.tms.entities.TicketDetails;

import com.capg.tms.model.TicketDetailsDTO;

public class TicketDetailsUtils {
	public static List<TicketDetailsDTO> convertToTicketDetailsDtoList(List<TicketDetails>list){
		List<TicketDetailsDTO> dtolist = new ArrayList<TicketDetailsDTO>();
		for (TicketDetails ticketdetails :list)
			dtolist.add(convertToTicketDetailsDto(ticketdetails));
		return dtolist;

	}
	public static TicketDetails convertToTicketDetails(TicketDetailsDTO dto) {
		TicketDetails ticketdetails = new TicketDetails(); 
		ticketdetails.setRoute(dto.getRoute());
		ticketdetails.setStatus(ticketdetails.getStatus());
		ticketdetails.setTicketId(ticketdetails.getTicketId());
		return ticketdetails;
		
	}
	public static TicketDetailsDTO convertToTicketDetailsDto(TicketDetails ticketdetails) {
		TicketDetailsDTO dto = new TicketDetailsDTO();
		dto.setRoute(ticketdetails.getRoute());
		dto.setStatus(ticketdetails.getTicketId());
		dto.setTicketId(ticketdetails.getTicketId());
		return dto;
	}
	
	

}
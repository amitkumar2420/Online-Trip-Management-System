package com.capg.tms.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class RouteDTO {
	
	
	private String routeId;
	private String  routeFrom;
	private String  routeTo;
	private  List<BusDTO> buses;
	private  LocalDateTime  departureTime;
	private  LocalDateTime   arrivalTime;
	private  LocalDate   doj;
	private String pickupPoint;
	private  double fare;
	
	

}

package com.capg.tms.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.capg.tms.entities.Route;
import com.capg.tms.model.RouteDTO;


public class RouteUtils {
	public static List<RouteDTO> convertToTravelsDtoList(List<Route>list){
		List<RouteDTO> dtolist = new ArrayList<RouteDTO>();
		for (Route route :list)
			dtolist.add(convertToRouteDto(route));
		return dtolist;
	}
	
	

	public static Route convertToRoute(RouteDTO dto) {
		Route route = new Route();
		route.setArrivalTime(dto.getArrivalTime());
		route.setBuses(dto.getBuses());
		route.setDepartureTime(dto.getDepartureTime());
		route.setDoj(dto.getDoj());
		route.setFare(dto.getFare());
		route.setPickupPoint(dto.getPickupPoint());
		route.setRouteFrom(dto.getRouteFrom());
		route.setRouteId(dto.getRouteId());
		route.setRouteTo(dto.getRouteTo());
	}
	
	public static RouteDTO convertToRoutedto(Route route) {
		RouteDTO dto = new RouteDTO();
		dto.setArrivalTime(route.getArrivalTime());
		dto.setBuses(route.getBuses());
		dto.setDepartureTime(route.getDepartureTime());
		dto.setDoj(dto.getDoj());
		dto.setFare(route.getFare());
		dto.setPickupPoint(dto.getPickupPoint());
		dto.setRouteFrom(route.getRouteFrom());
		dto.setRouteId(route.getRouteId());
		dto.setRouteTo(route.getRouteTo());
		
		
	}
	

	
	

}

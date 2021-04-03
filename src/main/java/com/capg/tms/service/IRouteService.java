package com.capg.tms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.tms.entities.Route;
import com.capg.tms.exceptions.RouteNotFoundException;
import com.capg.tms.model.RouteDTO;
@Service
public interface IRouteService {
	
	
	public  RouteDTO  addRoute(Route route);
	public  RouteDTO  updateRoute(Route route) throws RouteNotFoundException;
	public  RouteDTO   removeRoute(int routeId) throws RouteNotFoundException;
	public  RouteDTO    searchRoute(int routeId) throws RouteNotFoundException;
	public  List<RouteDTO> viewRouteList();
	
	
	
	

}

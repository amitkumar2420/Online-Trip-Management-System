package com.capg.tms.repository;

import java.util.List;

import com.capg.tms.entities.Route;
import com.capg.tms.exceptions.RouteNotFoundException;

public interface IRouteRepository {
	
	
	public  Route  addRoute(Route route);
	public  Route  updateRoute(Route route) throws RouteNotFoundException;
	public  Route   removeRoute(int routeId) throws RouteNotFoundException;
	public  Route    searchRoute(int routeId) throws RouteNotFoundException;
	public  List<Route> viewRouteList();
	
	
	
	

}

package com.capg.tms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.tms.entities.Route;
import com.capg.tms.exceptions.RouteNotFoundException;
import com.capg.tms.model.RouteDTO;
import com.capg.tms.repository.IRouteRepository;
import com.capg.tms.util.RouteUtils;

public class RouteServiceImpl implements IRouteService {
	@Autowired
	IRouteRepository routeRepo;

	@Override
	public RouteDTO addRoute(Route route) {
		Route routeEntity = routeRepo.save(route);
		return RouteUtils.convertToRouteDto(routeEntity);
	}

	@Override
	public RouteDTO updateRoute(Route route) throws RouteNotFoundException {
		
		Route routeEntity = routeRepo.save(route);
		return RouteUtils.convertToRouteDto(routeEntity);
	}

	@Override
	public RouteDTO removeRoute(int routeId) throws RouteNotFoundException {
		Route routetemp = new Route();
		routetemp = routeRepo.getOne((int)routeId);
		routeRepo.deleteById((int)routeId);
		return RouteUtils.convertToRouteDto(routetemp);
	}

	@Override
	public RouteDTO searchRoute(int routeId) throws RouteNotFoundException {
		Route routetemp = new Route();
		routetemp = routeRepo.getOne((int)routeId);
		routeRepo.findById((int)routeId);
		return RouteUtils.convertToRouteDto(routetemp);
	}

	@Override
	public List<RouteDTO> viewRouteList() {
		List<Route>getRoute=new ArrayList<Route>();
		getRoute=routeRepo.findAll();
		return RouteUtils.convertToRouteDTOList(getRoute);
	}

}

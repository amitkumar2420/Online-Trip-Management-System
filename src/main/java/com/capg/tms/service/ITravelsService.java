package com.capg.tms.service;

import java.util.List;

import com.capg.tms.entities.Travels;
import com.capg.tms.exceptions.TravelsNotFoundException;
import com.capg.tms.model.TravelsDTO;



public interface ITravelsService {
	
		
			public TravelsDTO  addTravels(Travels travels);
			public TravelsDTO  updateTravels(Travels travels) throws TravelsNotFoundException;
			public TravelsDTO  removeTravels(int travelsId) throws TravelsNotFoundException;
			public TravelsDTO searchTravels(int travelsId) throws TravelsNotFoundException;
			public  List<TravelsDTO>  viewTravels();
	
	

}

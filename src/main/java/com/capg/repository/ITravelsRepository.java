package com.capg.repository;

import java.util.List;
import com.capg.entities.Travels;
import com.capg.exceptions.TravelsNotFoundException;

public interface ITravelsRepository {
	
		
			public Travels  addTravels(Travels travels);
			public Travels  updateTravels(Travels travels) throws TravelsNotFoundException;
			public Travels  removeTravels(int travelsId) throws TravelsNotFoundException;
			public Travels searchTravels(int travelsId) throws TravelsNotFoundException;
			public  List<Travels>  viewTravels();
	
	

}
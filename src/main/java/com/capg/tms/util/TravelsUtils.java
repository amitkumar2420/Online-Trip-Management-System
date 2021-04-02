package com.capg.tms.util;
import java.util.ArrayList;
import java.util.List;
import com.capg.tms.entities.Travels;
import com.capg.tms.model.TravelsDTO;

public class TravelsUtils {
	
	
	

	public static List<TravelsDTO> convertToTravelsDTOList(List<Travels> list)
	{
		List<TravelsDTO> dtolist = new ArrayList<TravelsDTO>();
		for(Travels travel : list)
			dtolist.add(convertToTravelsDto(travel));
		return dtolist;
	
	}
	
	public static Travels convertToTravels(TravelsDTO dto)
	{
		Travels travel = new Travels();
		travel.setTravelsId(dto.getTravelsId());
		travel.setTravelsName(dto.getTravelsName());
		travel.setAddress(dto.getAddress());
		travel.setAgentName(dto.getAgentName());
		travel.setContact(dto.getContact());
		
		return travel;
	}
	
	public static TravelsDTO convertToTravelsDto(Travels travel) {
		TravelsDTO dto = new TravelsDTO();
		dto.setTravelsId(travel.getTravelsId());
		dto.setTravelsName(travel.getTravelsName());
		dto.setAddress(travel.getAddress());
		dto.setAgentName(travel.getAgentName());
		dto.setContact(travel.getContact());
		return dto;
	}
}

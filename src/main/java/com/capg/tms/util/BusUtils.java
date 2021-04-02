package com.capg.tms.util;

import java.util.ArrayList;
import java.util.List;
import com.capg.tms.entities.Bus;
import com.capg.tms.model.BusDTO;

public class BusUtils {

	public static List<BusDTO> convertToBusDTOList(List<Bus> list)
	{
		List<BusDTO> dtolist = new ArrayList<BusDTO>();
		for(Bus bus : list)
			dtolist.add(convertToBusDto(bus));
		return dtolist;
	
	}
	
	public static Bus convertToBus(BusDTO dto)
	{
		Bus bus = new Bus();
		bus.setBusId(dto.getBusId());
		bus.setBusType(dto.getBusType());
		bus.setBusNumber(dto.getBusNumber());
		bus.setCapacity(dto.getCapacity());
		bus.setTravel(dto.getTravel());
		return bus;
	}
	
	public static BusDTO convertToBusDto(Bus bus) {
		BusDTO dto = new BusDTO();
		dto.setBusId(bus.getBusId());
		dto.setBusType(bus.getBusType());
		dto.setBusNumber(bus.getBusNumber());
		dto.setCapacity(dto.getCapacity());
		dto.setTravel(bus.getTravel());
		return dto;
	}
}

package com.capg.tms.util;

import java.util.ArrayList;
import java.util.List;
import com.capg.tms.entities.Package;
import com.capg.tms.model.PackageDTO;

public class PackageUtils {

	public static List<PackageDTO> convertToPackageDTOList(List<Package> list)
	{
		List<PackageDTO> dtolist = new ArrayList<PackageDTO>();
		for(Package pa : list)
		dtolist.add(convertToPackageDto(pa));
		return dtolist;
		
	}
	
	public static Package convertToPackage(PackageDTO dto)
	{
		Package pa = new Package();
		pa.setPackageId(dto.getPackageId());
		pa.setPackageName(dto.getPackageName());
		pa.setPackageDescription(dto.getPackageDescription());
		pa.setPackageType(dto.getPackageType());
		pa.setPackageCost(dto.getPackageCost());
		return pa;
	}
	
	public static PackageDTO convertToPackageDto(Package pa) {
		PackageDTO dto = new PackageDTO();
		dto.setPackageId(pa.getPackageId());
		dto.setPackageName(pa.getPackageName());
		dto.setPackageDescription(pa.getPackageDescription());
		dto.setPackageType(pa.getPackageType());
		dto.setPackageCost(pa.getPackageCost());
		return dto;
	}
	
	
}

	
	
	
	

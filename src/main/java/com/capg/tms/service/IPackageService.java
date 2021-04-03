package com.capg.tms.service;

import java.util.List;

import com.capg.tms.exceptions.PackageNotFoundException;
import com.capg.tms.model.PackageDTO;

public interface IPackageService {
	
	
	public  PackageDTO  addPackage(Package pack);
	public  PackageDTO  deletePackage(int packageId) throws PackageNotFoundException;
	public  PackageDTO  searchPackage(int packageId) throws PackageNotFoundException;
	public  List<PackageDTO> viewAllPackages();
	
	

}
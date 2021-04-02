package com.capg.tms.service;

import java.util.List;

import com.capg.tms.exceptions.PackageNotFoundException;

public interface IPackageService {
	
	
	public  Package  addPackage(Package pack);
	public  Package  deletePackage(int packageId) throws PackageNotFoundException;
	public  Package  searchPackage(int packageId) throws PackageNotFoundException;
	public  List<Package> viewAllPackages();
	
	

}
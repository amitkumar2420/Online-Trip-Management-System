package com.capg.tms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.tms.exceptions.PackageNotFoundException;
import com.capg.tms.model.PackageDTO;
@Service
public class PackageServiceImpl implements IPackageService {

	@Override
	public PackageDTO addPackage(Package pack) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PackageDTO deletePackage(int packageId) throws PackageNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PackageDTO searchPackage(int packageId) throws PackageNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PackageDTO> viewAllPackages() {
		// TODO Auto-generated method stub
		return null;
	}

}

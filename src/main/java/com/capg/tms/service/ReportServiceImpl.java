package com.capg.tms.service;

import org.springframework.stereotype.Service;

import com.capg.tms.entities.Report;
import com.capg.tms.exceptions.ReportNotFoundException;
import com.capg.tms.model.ReportDTO;
@Service
public class ReportServiceImpl implements IReportService {

	@Override
	public ReportDTO addReport(Report report) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReportDTO deleteReport(int reportId) throws ReportNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReportDTO viewReport(int reportId) throws ReportNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReportDTO viewAllReports() {
		// TODO Auto-generated method stub
		return null;
	}

}

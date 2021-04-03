package com.capg.tms.service;

import com.capg.tms.entities.Report;
import com.capg.tms.exceptions.ReportNotFoundException;
import com.capg.tms.model.ReportDTO;

public interface IReportService {
	
	
		public ReportDTO  addReport(Report report);
		public ReportDTO  deleteReport(int reportId) throws ReportNotFoundException;
		public ReportDTO  viewReport(int reportId) throws ReportNotFoundException;
		public ReportDTO  viewAllReports();
		
	
	
	

}
package com.capg.service;

import com.capg.entities.Report;
import com.capg.exceptions.ReportNotFoundException;

public interface IReportService {
	
	
		public Report  addReport(Report report);
		public Report  deleteReport(int reportId) throws ReportNotFoundException;
		public Report  viewReport(int reportId) throws ReportNotFoundException;
		public Report  viewAllReports();
		
	
	
	

}
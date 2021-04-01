package com.capg.repository;


import com.capg.entities.Report;
import com.capg.exceptions.ReportNotFoundException;



public interface IReportRepository {
	
	
		public Report  addReport(Report report);
		public Report  deleteReport(int reportId) throws ReportNotFoundException;
		public Report  viewReport(int reportId) throws ReportNotFoundException;
		public Report  viewAllReports();
		
	
	
	

}

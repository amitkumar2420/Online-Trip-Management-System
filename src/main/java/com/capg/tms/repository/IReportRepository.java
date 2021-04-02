package com.capg.tms.repository;


import com.capg.tms.entities.Report;
import com.capg.tms.exceptions.ReportNotFoundException;



public interface IReportRepository {
	
	
		public Report  addReport(Report report);
		public Report  deleteReport(int reportId) throws ReportNotFoundException;
		public Report  viewReport(int reportId) throws ReportNotFoundException;
		public Report  viewAllReports();
		
	
	
	

}

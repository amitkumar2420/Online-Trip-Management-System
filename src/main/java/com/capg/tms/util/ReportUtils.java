package com.capg.tms.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.tms.entities.Report;
import com.capg.tms.model.ReportDTO;


  
public class ReportUtils

{
	public static List<ReportDTO> convertToReportDTOList(List<Report> list)
	{
		List<ReportDTO> dtolist = new ArrayList<ReportDTO>();
		for(Report report : list)
		dtolist.add(convertToReportDto(report));
		return dtolist;
		
	}
	
	public static Report convertToAdmin(ReportDTO dto)
	{
		Report report = new Report();
		report.setReportId(dto.getReportId());
		report.setReportType(dto.getReportType());
		report.setReportName(dto.getReportName());
		
		return report;
	}
	
	public static ReportDTO convertToReportDto(Report report) {
		ReportDTO dto = new ReportDTO();
		dto.setReportId(report.getReportId());
		dto.setReportName(report.getReportName());
		dto.setReportType(report.getReportType());
		return dto;
	}
	
	
}
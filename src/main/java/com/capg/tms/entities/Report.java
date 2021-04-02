package com.capg.tms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Report {
	@Id
	private int reportId;
	private String reportName;
	private String reportType;

}

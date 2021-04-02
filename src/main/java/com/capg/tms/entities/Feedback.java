package com.capg.tms.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Feedback {
	
	@Id
	private String feedbackId;
	private Customer customer;
	private String feedback;
	private  int rating;
	private LocalDate submitDate;

}

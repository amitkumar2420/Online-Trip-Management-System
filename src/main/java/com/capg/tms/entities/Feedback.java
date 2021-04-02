package com.capg.tms.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Feedback {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String feedbackId;
	private Customer customer;
	private String feedback;
	private  int rating;
	private LocalDate submitDate;

}

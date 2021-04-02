package com.capg.tms.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
@Component
public class FeedbackDTO {
	
	
	private String feedbackId;
	private CustomerDTO customer;
	private String feedback;
	private  int rating;
	private LocalDate submitDate;

}

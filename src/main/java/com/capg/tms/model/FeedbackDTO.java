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
	public FeedbackDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeedbackDTO(String feedbackId, CustomerDTO customer, String feedback, int rating, LocalDate submitDate) {
		super();
		this.feedbackId = feedbackId;
		this.customer = customer;
		this.feedback = feedback;
		this.rating = rating;
		this.submitDate = submitDate;
	}
	public String getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
	}
	public CustomerDTO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public LocalDate getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(LocalDate submitDate) {
		this.submitDate = submitDate;
	}
	@Override
	public String toString() {
		return "FeedbackDTO [feedbackId=" + feedbackId + ", customer=" + customer + ", feedback=" + feedback
				+ ", rating=" + rating + ", submitDate=" + submitDate + "]";
	}
	

}

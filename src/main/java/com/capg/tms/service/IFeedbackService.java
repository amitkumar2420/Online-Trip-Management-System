package com.capg.tms.service;

import java.util.List;

import com.capg.tms.entities.Feedback;
import com.capg.tms.exceptions.CustomerNotFoundException;
import com.capg.tms.exceptions.FeedbackNotFoundException;
import com.capg.tms.model.FeedbackDTO;

public interface IFeedbackService {
	
	
		public FeedbackDTO  addFeedback(Feedback feedback);
		public FeedbackDTO   findByFeedbackId(int feedbackId) throws FeedbackNotFoundException;
		public FeedbackDTO   findByCustomerId(int customerId) throws CustomerNotFoundException;
		public List<FeedbackDTO> viewAllFeedbacks();
	
	

}
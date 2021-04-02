package com.capg.tms.repository;

import java.util.List;

import com.capg.tms.entities.Feedback;
import com.capg.tms.exceptions.CustomerNotFoundException;
import com.capg.tms.exceptions.FeedbackNotFoundException;

public interface IFeedbackRepository {
	
	
		public Feedback  addFeedback(Feedback feedback);
		public Feedback   findByFeedbackId(int feedbackId) throws FeedbackNotFoundException;
		public Feedback   findByCustomerId(int customerId) throws CustomerNotFoundException;
		public List<Feedback> viewAllFeedbacks();
	
	

}

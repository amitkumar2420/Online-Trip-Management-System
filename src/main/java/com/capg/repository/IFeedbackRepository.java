package com.capg.repository;

import java.util.List;
import com.capg.entities.Feedback;
import com.capg.exceptions.CustomerNotFoundException;
import com.capg.exceptions.FeedbackNotFoundException;

public interface IFeedbackRepository {
	
	
		public Feedback  addFeedback(Feedback feedback);
		public Feedback   findByFeedbackId(int feedbackId) throws FeedbackNotFoundException;
		public Feedback   findByCustomerId(int customerId) throws CustomerNotFoundException;
		public List<Feedback> viewAllFeedbacks();
	
	

}

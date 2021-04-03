package com.capg.tms.service;

import java.util.List;

import com.capg.tms.entities.Feedback;
import com.capg.tms.exceptions.CustomerNotFoundException;
import com.capg.tms.exceptions.FeedbackNotFoundException;
import com.capg.tms.model.FeedbackDTO;

public class FeedbackServiceImpl implements IFeedbackService {

	@Override
	public FeedbackDTO addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FeedbackDTO findByFeedbackId(int feedbackId) throws FeedbackNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FeedbackDTO findByCustomerId(int customerId) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FeedbackDTO> viewAllFeedbacks() {
		// TODO Auto-generated method stub
		return null;
	}

}

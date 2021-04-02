package com.capg.tms.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.capg.tms.entities.Feedback;
import com.capg.tms.model.FeedbackDTO;



public class FeedbackUtils {
	public static List<FeedbackDTO> convertToFeedbackDTOList(List<Feedback> list)
	{
		List<FeedbackDTO> dtolist = new ArrayList<FeedbackDTO>();
		for(Feedback feedback : list)
		dtolist.add(convertToFeedbackDto(feedback));
		return dtolist;
		
	}
	
	public static Feedback convertToFeedback(FeedbackDTO dto)
	{
		Feedback feedback = new Feedback();
		feedback.setFeedbackId(dto.getFeedbackId());
		feedback.setcustomer(dto.getCustomer());
		feedback.setFeedback(dto.getFeedback());
		feedback.setRating(dto.getRating());
		feedback.setSubmitDate(dto.getSubmitDate());
		return feedback;
	}
	
	public static FeedbackDTO convertToFeedbackDto(Feedback feedback) {
		FeedbackDTO dto = new FeedbackDTO();
		dto.setFeedbackId(feedback.getFeedbackId());
		dto.setcustomer(feedback.getCustomer());
		dto.setFeedback(feedback.getFeedback());
		dto.setRating(feedback.getRating());
		dto.setSubmitDate(feedback.getSubmitDate());
		return dto;
	}
	
	



	

	

}

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.tms.entities.Feedback;
import com.capg.tms.exceptions.CustomerNotFoundException;
import com.capg.tms.exceptions.FeedbackNotFoundException;
import com.capg.tms.model.FeedbackDTO;
import com.capg.tms.repository.IBookingRepository;
import com.capg.tms.repository.IFeedbackRepository;
import com.capg.tms.util.FeedbackUtils;


public class FeedbackServiceImpl implements IFeedbackService {
	@Autowired
	IFeedbackRepository feedbackRepo;

	@Override
	public FeedbackDTO addFeedback(Feedback feedback) {
		Feedback addFeedback=new Feedback();
		addFeedback=feedbackRepo.save(feedback);
		return FeedbackUtils.convertToFeedbackDto(addFeedback);
		
	}

	@Override
	public FeedbackDTO findByFeedbackId(int feedbackId) throws FeedbackNotFoundException {
		Feedback findbyid=new Feedback();
		findbyid=feedbackRepo.getOne((int) feedbackId);
		feedbackRepo.findById((int) feedbackId);
		return FeedbackUtils.convertToFeedbackDto(findbyid);
		
		
	}

	@Override
	public FeedbackDTO findByCustomerId(int customerId) throws CustomerNotFoundException {
		Feedback custid=new Feedback();
		custid=feedbackRepo.getOne((int) customerId);
		feedbackRepo.findById((int) customerId);
		return FeedbackUtils.convertToFeedbackDto(custid);
		
	}

	@Override
	public List<FeedbackDTO> viewAllFeedbacks() {
		List<Feedback> getFeedback=new ArrayList<Feedback>();
		 getFeedback=feedbackRepo.findAll();
		 return FeedbackUtils.convertToFeedbackDtoList(getFeedback);
		 
		
		
	}

}


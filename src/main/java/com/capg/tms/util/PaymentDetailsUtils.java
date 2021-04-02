package com.capg.tms.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.tms.entities.PaymentDetails;
import com.capg.tms.model.PaymentDetailsDTO;

public class PaymentDetailsUtils {
	
	public static List<PaymentDetailsDTO> convertToPaymentDetailsDTOList(List<PaymentDetails> list)
	{
		List<PaymentDetailsDTO> dtolist = new ArrayList<PaymentDetailsDTO>();
		for(PaymentDetails payment : list)
		dtolist.add(convertToPaymentDetailsdto(payment));
		return dtolist;
		}
	
	

	public static PaymentDetails convertToPaymentDetails(PaymentDetailsDTO dto)
	{
		PaymentDetails payment = new PaymentDetails();
		payment.setPaymentId(dto.getPaymentId());
		payment.setPaymentMode(dto.getPaymentMode());
		payment.setBankName(dto.getBankName());
		payment.setCardNo(dto.getCardNo());
		payment.setNetAmount(dto.getNetAmount());
		payment.setPaymentStatus(dto.getPaymentStatus());
		payment.setUserId(dto.getUserId());
		return payment;
	}
	
	public static PaymentDetailsDTO convertToBookingDto(PaymentDetails payment) {
		PaymentDetailsDTO dto = new PaymentDetailsDTO();
		dto.setPaymentId(payment.getPaymentId());
		dto.setPaymentMode(payment.getPaymentMode());
		dto.setBankName(payment.getBankName());
		dto.setCardNo(payment.getCardNo());
		dto.setNetAmount(payment.getNetAmount());
		dto.setPaymentStatus(payment.getPaymentStatus());
		dto.setUserId(payment.getUserId());
		return dto;
	}
	
	
}

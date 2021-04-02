package com.capg.tms.model;

import org.springframework.stereotype.Component;

@Component
public class PaymentDetailsDTO {
	
	private  int paymentId;
	private  String paymentMode;
	private  String bankName;
	private  long  cardNo;
	private double   netAmount;
	private  String  paymentStatus;
	private  int userId;

}

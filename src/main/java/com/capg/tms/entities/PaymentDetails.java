package com.capg.tms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaymentDetails {
	@Id
	private  int paymentId;
	private  String paymentMode;
	private  String bankName;
	private  long  cardNo;
	private double   netAmount;
	private  String  paymentStatus;
	private  int userId;

}

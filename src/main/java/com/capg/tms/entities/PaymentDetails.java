package com.capg.tms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class PaymentDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="payment_id")
	private  int paymentId;
	
	@NotNull
	@Column(name="payment_mode", length=25)
	private  String paymentMode;
	
	@NotNull
	@Column(name="bank_name", length=25)
	private  String bankName;
	
	@NotNull
	@Column(name="card_no")
	private  long  cardNo;
	
	@NotNull
	@Column(name="net_amt")
	private double   netAmount;
	
	@NotNull
	@Column(name="payment_status", length=25)
	private  String  paymentStatus;
	
	@NotNull
	@Column(name="user_id")
	private  int userId;
	
	public PaymentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentDetails(int paymentId, String paymentMode, String bankName, long cardNo, double netAmount,
			String paymentStatus, int userId) {
		super();
		this.paymentId = paymentId;
		this.paymentMode = paymentMode;
		this.bankName = bankName;
		this.cardNo = cardNo;
		this.netAmount = netAmount;
		this.paymentStatus = paymentStatus;
		this.userId = userId;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public double getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(double netAmount) {
		this.netAmount = netAmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "PaymentDetails [paymentId=" + paymentId + ", paymentMode=" + paymentMode + ", bankName=" + bankName
				+ ", cardNo=" + cardNo + ", netAmount=" + netAmount + ", paymentStatus=" + paymentStatus + ", userId="
				+ userId + "]";
	}

}

package com.capg.tms.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingId;
	private String description;
	
	
    @Column(name = "booking_type",nullable = false,length = 10)
	private String bookingType;
	
	
	
    @Column(name = "booking_title",nullable = false)
	private String bookingTitle;
	
	private  LocalDate bookingDate;
	private  int userId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="package_id",table = "Package")
	private Package pack;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id",table = "User")
	private User user;
	
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int bookingId, String bookingType, String description, String bookingTitle, LocalDate bookingDate,
			Package pack, int userId) {
		super();
		this.bookingId = bookingId;
		this.bookingType = bookingType;
		this.description = description;
		this.bookingTitle = bookingTitle;
		this.bookingDate = bookingDate;
		this.pack = pack;
		this.userId = userId;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBookingTitle() {
		return bookingTitle;
	}
	public void setBookingTitle(String bookingTitle) {
		this.bookingTitle = bookingTitle;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Package getPack() {
		return pack;
	}
	public void setPack(Package pack) {
		this.pack = pack;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingType=" + bookingType + ", description=" + description
				+ ", bookingTitle=" + bookingTitle + ", bookingDate=" + bookingDate + ", pack=" + pack + ", userId="
				+ userId + "]";
	}
	
	
	
	

}

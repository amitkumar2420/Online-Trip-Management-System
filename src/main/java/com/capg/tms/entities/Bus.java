package com.capg.tms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bus {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int busId;
	private  String busType;
	private  String busNumber;
	private int capacity;
	private Travels travel;

}

package com.capg.tms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Travels {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int travelsId;
	private String travelsName;
	private String  agentName;
	private String  address;
	private String  contact;

}

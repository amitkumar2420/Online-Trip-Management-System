package com.capg.tms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Travels {
	@Id
	private int travelsId;
	private String travelsName;
	private String  agentName;
	private String  address;
	private String  contact;

}

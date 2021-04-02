package com.capg.tms.model;

import org.springframework.stereotype.Component;

@Component
public class TravelsDTO {
	
	private int travelsId;
	private String travelsName;
	private String  agentName;
	private String  address;
	private String  contact;
	public TravelsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TravelsDTO(int travelsId, String travelsName, String agentName, String address, String contact) {
		super();
		this.travelsId = travelsId;
		this.travelsName = travelsName;
		this.agentName = agentName;
		this.address = address;
		this.contact = contact;
	}
	public int getTravelsId() {
		return travelsId;
	}
	public void setTravelsId(int travelsId) {
		this.travelsId = travelsId;
	}
	public String getTravelsName() {
		return travelsName;
	}
	public void setTravelsName(String travelsName) {
		this.travelsName = travelsName;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "TravelsDTO [travelsId=" + travelsId + ", travelsName=" + travelsName + ", agentName=" + agentName
				+ ", address=" + address + ", contact=" + contact + "]";
	}
	

}

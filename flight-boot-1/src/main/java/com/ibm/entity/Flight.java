package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flights")
public class Flight {
	@Id
	private int code;
	@Column(length = 15)
	private String Bus;
	@Column(length = 15)
	private String source;
	@Column(length = 15)
	private String destination;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getCarrier() {
		return Bus;
	}
	public void setCarrier(String Bus) {
		this.Bus = Bus;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
}

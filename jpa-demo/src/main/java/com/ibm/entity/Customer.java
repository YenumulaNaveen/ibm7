package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")

public class Customer {
	@Id
	@Column(name = "cust_id")
	private int custId;
	@Column(name = "cname")
	private String custName;
	@Column(name = "cr_limit")
	private int creditLimit;
	
	//Constructors
	public Customer() {

	}

	public Customer(int custId, String custName, double creditLimit) {
		this.custId = custId;
		this.custName = custName;
		this.creditLimit = (int)creditLimit;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustlimit() {
		return creditLimit;
	}

	public void setCustlimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	


}

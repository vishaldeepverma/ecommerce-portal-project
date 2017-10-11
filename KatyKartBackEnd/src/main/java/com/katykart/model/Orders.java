package com.katykart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table

public class Orders {
	
	
	@Id
	@GeneratedValue
	private int orderid;
	
	
	
	@Column(columnDefinition = "varchar(30)")
	private String username;
	
	

	@Column(columnDefinition = "varchar(50)")
	private String paymode,shipmentaddress,status;
	
	@Column(columnDefinition = "integer(30)")
	private int total;
	
	@Column(columnDefinition = "varchar(50)")
	private String Email;
	
	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}


	

	public String getPaymode() {
		return paymode;
	}


	public void setPaymode(String paymode) {
		this.paymode = paymode;
	}


	public String getShipmentaddress() {
		return shipmentaddress;
	}


	public void setShipmentaddress(String shipmentaddress) {
		this.shipmentaddress = shipmentaddress;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	

}

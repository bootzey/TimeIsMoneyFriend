package com.timeismoney.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class shifts {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int employeeid;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date timein,timeout;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	
	

}

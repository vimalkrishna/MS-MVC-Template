package org.mylife.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auto {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private long id;
	private String name;
	private int odometer;
	private String status;
	private String driver;
	
	@Override
	public String toString() {
		return "Auto [name=" + name + ", driver=" + driver + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOdometer() {
		return odometer;
	}

	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	

}

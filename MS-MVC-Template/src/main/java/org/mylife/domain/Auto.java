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
	
	

}

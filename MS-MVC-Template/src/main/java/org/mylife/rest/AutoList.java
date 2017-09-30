package org.mylife.rest;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.mylife.domain.Auto;

/**
 * 
 * @author vimal
 * We want to control outermost tag
 *
 */
@XmlRootElement(name="autos")
public class AutoList {
	private List<Auto> autos;
	
	// Default constructor for JAXB
	public AutoList() { }
	
	public AutoList(List<Auto> autos) {
		this.autos=autos;
	}

	@XmlElement(name="auto")
	public List<Auto> getAutos() {
		return autos;
	}

	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}
	
	
}

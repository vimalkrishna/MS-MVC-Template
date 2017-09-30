package org.mylife.rest;

import java.util.List;

import org.mylife.controllers.data.AutoRepository;
import org.mylife.domain.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Controller + @ResponseBody any thing returned by method of this class
 * will be serialized appropriately to Representation (JSON/XML)
 * */
@RestController
public class AutoRestController {
	
	@Autowired
	private AutoRepository data;
	
	@RequestMapping("/autos")
	public AutoList allAuto() {
		List<Auto> allAuto = data.findAll();
		return new AutoList(allAuto);
		
	}

	// Now some post method
	
	
	
	
	
}

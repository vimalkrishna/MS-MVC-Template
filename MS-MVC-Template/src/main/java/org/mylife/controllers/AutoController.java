package org.mylife.controllers;

import java.util.List;

import org.mylife.controllers.data.AutoRepository;
import org.mylife.domain.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/webapp/autos/")
public class AutoController {
	
	@Autowired
	private AutoRepository autoData;
	
	@RequestMapping(value="/newAuto.html", method=RequestMethod.POST)
	public String newAuto(Auto auto) {
		 autoData.save(auto);
		return "redirect:/webapp/autos/list.html";
	}
	
	@RequestMapping(value="/newAuto.html", method=RequestMethod.GET)
	public ModelAndView createAuto() {
		Auto auto = new Auto();
		// Model Attibute is "form"
		return new ModelAndView("newAuto", "form", auto);
	}
	
	
	@RequestMapping(value="/list.html", method=RequestMethod.GET)
	public ModelAndView autos() {
		List<Auto> allAutos =  autoData.findAll();
		// (viewName,modelName,Object)
		return new ModelAndView("allAutos","autos",allAutos);
	}
	
	@RequestMapping(value="/auto/{name}")
	public ModelAndView showAutoByName(@PathVariable("name") String name) {
		
		throw new UnsupportedOperationException();
	}
	

}

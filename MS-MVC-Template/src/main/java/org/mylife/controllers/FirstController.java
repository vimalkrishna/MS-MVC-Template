package org.mylife.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@RequestMapping("/home.html")
	public ModelAndView firstPage() {
		// Model Object for JSP
		Date dateTime = new Date();
		
		// return a new Instance of Model and View and pass a name of JSP file
		//Without view resolver
		return new ModelAndView("welcome","dateTime", dateTime);
	}

}

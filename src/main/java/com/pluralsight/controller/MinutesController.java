package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {
	
	@RequestMapping(value = "/addMinutes")  // the actual url provided should be: http://localhost:8070/FitnessTracker/addMinutes.html
	public String addMinutes(){
		
		return "addMinutes";  //the returning path will be /WEB-INF/jsp/addMinutes.jsp
//		return "forward:addMoreMinutes.html";  //continue old request, keep all former data	
//		return "redirect:addMoreMinutes.html"; //close the old request, lost all former data
	}	
}

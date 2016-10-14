package com.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;

@Controller
public class MinutesController {
	
	@RequestMapping(value = "/addMinutes")  // the actual url provided should be: http://localhost:8070/FitnessTracker/addMinutes.html
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise){
		System.out.println("exercise: " + exercise.getMinutes());

		return "addMinutes";  //the returning path will be /WEB-INF/jsp/addMinutes.jsp
//		return "forward:addMoreMinutes.html";  // it is *.html, it doesn't work if not this .html, and 
											   // continue old request, keep all former data	
//		return "redirect:addMoreMinutes.html"; //close the old request, lost all former data
	}	
	
//	@RequestMapping(value = "/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise){
//		System.out.println("exercising: " + exercise.getMinutes());
//		return "addMinutes";
//	}
	
	@RequestMapping(value = "/activities", method = RequestMethod.GET) 
	public @ResponseBody List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		run.setDesc("bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		run.setDesc("swim");
		activities.add(swim);
		
		return activities;
	}
}

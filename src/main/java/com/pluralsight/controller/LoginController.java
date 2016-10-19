package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(ModelMap model){
		
		System.out.println("in login");
		return "login";
	}

	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(ModelMap model){
		
		System.out.println("logout");
		return "logout";
	}
	
//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	public void loginPost(ModelMap model){
//		
//		System.out.println("logged in");
//		return "index";
//	}
	
	@RequestMapping(value="/loginFailed", method=RequestMethod.GET)
	public String loginFailed(ModelMap model) {
		System.out.println("log in failed");
		model.addAttribute("error", "true");
		return "login";
	}
}

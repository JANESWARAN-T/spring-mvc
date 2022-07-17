package com.janeswaran.springboot.webusingspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.janeswaran.springboot.webusingspring.service.LoginService;

@Controller

public class LoginController {
	
	@Autowired
	LoginService serv;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login( ModelMap model) {
//		model.put("nam", name);
//		model.put("password", pw); // to get the mvc value
//		System.out.println("the pw is"+pw);
//		System.out.println(name);   //for request parameter
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String log(ModelMap model, @RequestParam String name, @RequestParam String pw) {
		
		boolean uservalid = serv.Validate(name, pw);
		
		if(!uservalid) {
			model.put("error", "Invalid Credentials!!");
			return "login";
		}
		model.put("name", name);
		model.put("password", pw); // to get the mvc value
		System.out.println("the pw is"+pw);
		return "log";
	}
	
	

}

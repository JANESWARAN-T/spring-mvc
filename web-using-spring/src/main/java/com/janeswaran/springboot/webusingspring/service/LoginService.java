package com.janeswaran.springboot.webusingspring.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	
	public boolean Validate(String userid, String pw) {
		
		return userid.equalsIgnoreCase("janes")&& pw.equalsIgnoreCase("123");
	}
}

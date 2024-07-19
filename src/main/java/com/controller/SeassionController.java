package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SeassionController {

	@GetMapping("/signUp")
	public String signUp() {
		return "SignUp"; 
	}
	
	@GetMapping("/login")
	public String login() {
		return "LogIn"; 
	}
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome";
	}
}

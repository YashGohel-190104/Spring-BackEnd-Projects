package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Bean.CricketBean;

@Controller
public class CricketReg {

	@GetMapping("/BoxCricketRegistration")
	public String BoxReg() {
		return "BoxCricket";
	}
	
	@PostMapping("/SaveReg")
	public String saveRegistration(CricketBean cri, Model model) {
		System.out.println("Name::"+cri.getStudentName());
		System.out.println("Player Type::" + cri.getPlayerType());
		System.out.println("Food::" + cri.getFood());
		System.out.println("Drink ::" + cri.getDrink());
		
		boolean isError = false;
		String alphaRegex = "[a-zA-Z]+";
		
		if(cri.getStudentName() == null || cri.getStudentName().trim().length()==0) {
			isError = true;
			model.addAttribute("StudentNameError","Please Enter Student Name");
		}else if(cri.getStudentName().matches(alphaRegex) == false) {
			isError = true;
			model.addAttribute("StudentNameError","Please Enter Vailed Name");
		}
		if(cri.getPlayerType() == null) {
			isError = true;
			model.addAttribute("PlayerTypeError","Please Select Player Type");
		}
		if(cri.getFood().equals("-1") == true) {
			isError = true;
			model.addAttribute("FoodError","Please Select Food Type");
		}
		
		if(isError == true) {
			return "BoxCricket"; 
		}
		else {
			model.addAttribute("reg", cri);
			return "Detail";
		}
	}
}

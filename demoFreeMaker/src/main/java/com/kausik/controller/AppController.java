package com.kausik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kausik.service.UserDetails;

@Controller
public class AppController {
	
	@Autowired
	UserDetails userDetails;
	
	@RequestMapping("/home")
	private String showIndex(Model model){
		userDetails.setName("Kausik");
		userDetails.setAddress("Keshtopur");
		model.addAttribute("name", userDetails.getName());
		return "index";
	}
}

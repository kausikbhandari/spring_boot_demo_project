package com.kausik.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@RequestMapping("/home")
	public String sayHello(){
		return "Hello There";
	}
}

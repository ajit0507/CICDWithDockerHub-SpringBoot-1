package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String getWelcome()
	{
		System.out.println("WelcomeController.getWelcome()");
		System.out.println("WelcomeController.getWelcome()");

		System.out.println("WelcomeController.getWelcome(7)");
		return "welcome to docker CI CD pipleline work5";

	}
	
}

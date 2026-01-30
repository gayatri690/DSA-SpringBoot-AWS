package com.example.oAuth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	@GetMapping("/")
	public String index() {
		return "This is index page";
	}
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to the Home Page";
	}
}


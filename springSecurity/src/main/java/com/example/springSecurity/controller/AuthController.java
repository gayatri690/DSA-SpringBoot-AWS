package com.example.springSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springSecurity.dto.LoginUserDTO;
import com.example.springSecurity.dto.RegisterUserDTO;
import com.example.springSecurity.entity.Users;
import com.example.springSecurity.service.AuthenticationService;
import com.example.springSecurity.service.JWTService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private  JWTService jwtService;
	@Autowired
	private  AuthenticationService authenticationService;
	
	
	@PostMapping("/register")
	public ResponseEntity<Users> register(@RequestBody RegisterUserDTO regiserUserDto){
		Users registeredUser=authenticationService.register(regiserUserDto);
		return ResponseEntity.ok(registeredUser);
	}
	
	@PostMapping("/login")
	public String authenticate(@RequestBody LoginUserDTO loginUserdto) {
		Users authenticatedUser=authenticationService.authenticate(loginUserdto);
		String jwtToken=jwtService.generateToken(authenticatedUser);
		return jwtToken;
	}
}

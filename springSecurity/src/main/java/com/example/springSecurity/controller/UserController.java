package com.example.springSecurity.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springSecurity.entity.Users;
import com.example.springSecurity.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserService userService;
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@GetMapping("/me")
	//@PreAuthorize("isAuthenticated()")
	public ResponseEntity<Users> authenticatedUser(){
		System.out.println("inside login  : ");
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		Users currentUser=(Users) authentication.getPrincipal();
		
		System.out.println("current User : "+currentUser.getFullName());
		return ResponseEntity.ok(currentUser);
	}
	
	@GetMapping("/all")
	@PreAuthorize("hasAnyRole('ADMIN','SUPERADMIN','MANAGER')")
	public ResponseEntity<List<Users>> allUsers(){
		System.out.println("inside all  : ");
		List<Users> users=userService.allUsers();
		return ResponseEntity.ok(users);
	}
}

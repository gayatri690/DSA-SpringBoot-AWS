package com.example.springSecurity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springSecurity.entity.Users;
import com.example.springSecurity.repository.UserRepsitory;

@Service
public class UserService {

	private UserRepsitory userRepository;
	public UserService(UserRepsitory userRepository) {
		this.userRepository=userRepository;
	}
	public List<Users> allUsers(){
		List<Users> users=new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
}

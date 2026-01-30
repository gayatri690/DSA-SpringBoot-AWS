package com.example.springSecurity.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.springSecurity.dto.LoginUserDTO;
import com.example.springSecurity.dto.RegisterUserDTO;
import com.example.springSecurity.entity.Users;
import com.example.springSecurity.repository.UserRepsitory;

@Service
public class AuthenticationService {
	private UserRepsitory userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthenticationService(
    	UserRepsitory userRepository,
        AuthenticationManager authenticationManager,
        PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    
    public Users register(RegisterUserDTO input) {
    	Users user=new Users();
    	user.setFullName(input.getFullName());
    	user.setEmail(input.getEmail());
    	user.setPassword(passwordEncoder.encode(input.getPassword()));
    	user.setRole(input.getRole());
    	return userRepository.save(user);
    }
    
    public Users authenticate(LoginUserDTO input) {
    	authenticationManager.authenticate(
    			new UsernamePasswordAuthenticationToken(input.getEmail(),input.getPassword()));
    	return userRepository.findByEmail(input.getEmail()).orElseThrow();
    }
}

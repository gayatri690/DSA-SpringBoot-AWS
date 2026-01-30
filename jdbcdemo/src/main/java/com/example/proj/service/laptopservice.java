package com.example.proj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proj.model.Laptop;
import com.example.proj.repository.laptoprepository;
@Service
public class laptopservice {

@Autowired
laptoprepository lptr;

@Autowired
Laptop lp;
	public void callService() {
		
		String sql="insert into user(?,?,?)";
		lp.
		// TODO Auto-generated method stub
		System.out.println("laptop service is called...");
		lptr.save();
	}

}

package com.example.proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.proj.model.Laptop;
import com.example.proj.service.laptopservice;

@SpringBootApplication
public class JdbcdemoApplication {

	public static void main(String[] args) {
	ApplicationContext ctn=SpringApplication.run(JdbcdemoApplication.class, args);
	
	Laptop lp=ctn.getBean(Laptop.class);
	
	lp.getcode();
	
	laptopservice lpsr=ctn.getBean(laptopservice.class);
	lpsr.callService();
	
	}

}

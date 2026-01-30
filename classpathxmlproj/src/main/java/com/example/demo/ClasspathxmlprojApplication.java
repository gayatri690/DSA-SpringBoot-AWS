package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.Alien;

//@SpringBootApplication
public class ClasspathxmlprojApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ClasspathxmlprojApplication.class, args);
		
		ApplicationContext ctn=new ClassPathXmlApplicationContext("spring.xml");
		Alien al=(Alien)ctn.getBean("Alien");
		al.code();
	}

}

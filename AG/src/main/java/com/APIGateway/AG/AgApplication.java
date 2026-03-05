package com.APIGateway.AG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AgApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgApplication.class, args);
	}

}

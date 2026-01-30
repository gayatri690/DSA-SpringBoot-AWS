package com.example.kafkaProject.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

	@KafkaListener(topics="order-events",groupId="order-group")
	public void consume(String message) {
		System.out.println("Recived event: "+message);
	}
}

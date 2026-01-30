package com.week2.datajpa.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmpConsumer {
	@KafkaListener(topics="order-events",groupId="emp-group")
	public void consume(String message) {
		System.out.println("Recived event: "+message);
	}
}

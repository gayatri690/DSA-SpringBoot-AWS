package com.example.kafkaProject.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {

	private KafkaTemplate<String,String> kafkaTemplate;
	
	public OrderProducer(KafkaTemplate<String,String> kafkaTemplate) {
		this.kafkaTemplate=kafkaTemplate;
	}
	
	public void sendOrderEvent(String data) {
	    kafkaTemplate.send("order-events",data);
	}
}

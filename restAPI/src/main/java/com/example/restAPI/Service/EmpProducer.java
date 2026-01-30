package com.example.restAPI.Service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmpProducer {

	private KafkaTemplate<String,String> kafkaTemplate;
	public EmpProducer(KafkaTemplate<String,String> kafkaTemplate) {
		this.kafkaTemplate=kafkaTemplate;
	}
	
	public void sendOrderEvent(String data) {
		kafkaTemplate.send("order-events",data);
	}
	
}

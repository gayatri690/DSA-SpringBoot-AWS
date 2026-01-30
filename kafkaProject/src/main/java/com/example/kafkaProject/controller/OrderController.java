package com.example.kafkaProject.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkaProject.service.OrderProducer;

@RestController
public class OrderController {

	private OrderProducer producer;
	
	public OrderController(OrderProducer producer) {
		this.producer=producer;
	}
	
	@PostMapping("/orders")
	public String createOrder(@RequestBody String OrderStatus)
	{
		producer.sendOrderEvent(OrderStatus);
		return "Order event sent to kafka";
	}
}

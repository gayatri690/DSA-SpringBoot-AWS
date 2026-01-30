package com.example.restAPI.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RestControllerAdvice
@RequestMapping("/app/v1")
public class productController {

	List<String> products = new ArrayList<>();
	
	@GetMapping("/products")
	public List<String> getProducts() {
		return products;
	}
	
	@PostMapping("/products")
	public String addProducts(@RequestBody String product) {
		products.add(product);
		return "Product added successfully"+product;
	}
	
	@PutMapping("/products/{id}")
	public String updateProduct(@RequestBody String product,@PathVariable int id) {
		products.set(id, product);
		return "Product updated successfully "+product;	
	}
	
	@DeleteMapping("/products/{id}")
	public String deleteProduct(@PathVariable int id) {
		products.remove(id);
		return "Product removed successfully";
	}
	
	@ExceptionHandler(Exception.class)
	public String Handler(Exception e) {
		return "Error occured: "+e.getMessage();
	}
}



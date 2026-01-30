package com.example.restAPI.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/v2")
public class NewProductController {
//List<String> products = new ArrayList<>();
    Map<Integer,String> products=new HashMap<>();	

    @GetMapping("/products")
	public Map<Integer,String> getProducts() {
		return products;
	}
	
	@PostMapping("/products/{id}")
	public String addProducts(@RequestBody String product,@PathVariable int id) {
		products.put(id,product);
		return "Product added successfully"+product;
	}
	
//	@PutMapping("/products/{id}")
//	public String updateProduct(@RequestBody String product,@PathVariable int id) {
//		products.set(id, product);
//		return "Product updated successfully "+product;	
//	}
//	
//	@DeleteMapping("/products/{id}")
//	public String deleteProduct(@PathVariable int id) {
//		products.remove(id);
//		return "Product removed successfully";
//	}
}

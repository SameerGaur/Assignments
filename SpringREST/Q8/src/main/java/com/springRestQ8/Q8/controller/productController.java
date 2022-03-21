package com.springRestQ8.Q8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRestQ8.Q8.model.Product;
import com.springRestQ8.Q8.service.productService;

@RestController
public class productController {

	@Autowired
	private productService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productService.getAllProduct();
	}
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable String id) {
		return productService.getProduct(id);
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@PutMapping("/products/{id}")
	public void updateProduct(@RequestBody Product product, @PathVariable String id) {
		productService.updateProduct(id,product);
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@RequestBody Product product, @PathVariable String id) {
		productService.deleteProduct(id,product);
	}
}

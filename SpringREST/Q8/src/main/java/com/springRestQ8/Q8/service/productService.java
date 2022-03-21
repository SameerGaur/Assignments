package com.springRestQ8.Q8.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springRestQ8.Q8.Repository.productRepository;
import com.springRestQ8.Q8.model.Product;

@Component
public class productService {

	@Autowired
	private productRepository productRepository;
	
	public List<Product>getAllProduct(){
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}

	public Product getProduct(String id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
		
	}

	public void updateProduct(String id, Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
	}

	public void deleteProduct(String id, Product product) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
	}
}

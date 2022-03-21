package com.springRestQ8.Q8.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springRestQ8.Q8.model.Product;

@Repository
public interface productRepository extends MongoRepository<Product, String>{

//	Product findOne(String id);
	public Optional<Product> findById(String id);

}

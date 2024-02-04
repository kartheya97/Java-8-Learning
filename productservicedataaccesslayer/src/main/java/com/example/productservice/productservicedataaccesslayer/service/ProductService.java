package com.example.productservice.productservicedataaccesslayer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.productservice.productservicedataaccesslayer.model.Product;
import com.example.productservice.productservicedataaccesslayer.repository.ProductRepository;

@Component
public class ProductService implements CommandLineRunner{

	@Autowired
	private ProductRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repository.save(new Product(1,"Pencil Box","Apsara Pencil Box","Texas"));
		repository.save(new Product(2,"Tiffin Box","Steel Lunch Box","Hyderabad"));
		
		Optional<Product> product = repository.findById(1l);
		if(!product.isEmpty())
			System.out.println(product.get());
		
	}

}

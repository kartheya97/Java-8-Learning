package com.example.productservice.productservicedataaccesslayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.productservice.productservicedataaccesslayer.model.Product;
import com.example.productservice.productservicedataaccesslayer.repository.ProductRepository;

@SpringBootTest
class ProductservicedataaccesslayerApplicationTests {

	@Autowired
	private ProductRepository repository;
	
	@Test
	void saveProductRecordToDB() {
		
		Product product = new Product();
		product.setId(1);
		product.setProductName("Pencil Box");
		product.setDescription("Apsara Pencil Box");
		product.setShippingAddress("Hyderabad");
		repository.save(product);
		
	}

	@Test
	void findRecordById() {
		Optional<Product> product = repository.findById(1l);
		assertEquals("Pencil Box", product.get().getProductName());
	}
	
	
}

package com.example.productservice.productservicedataaccesslayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productservice.productservicedataaccesslayer.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

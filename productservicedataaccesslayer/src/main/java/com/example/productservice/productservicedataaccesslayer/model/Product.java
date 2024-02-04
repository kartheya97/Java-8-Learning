package com.example.productservice.productservicedataaccesslayer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	private long id;
	private String productName;
	private String description;
	private String shippingAddress;
	
	public Product() {
		
	}
	
	public Product(long id, String productName, String description, String shippingAddress) {
		super();
		this.id = id;
		this.productName = productName;
		this.description = description;
		this.shippingAddress = shippingAddress;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", description=" + description
				+ ", shippingAddress=" + shippingAddress + "]";
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	
}

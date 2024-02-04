package com.example.springdatajpa.coupondataacesslayer.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springdatajpa.coupondataacesslayer.model.Coupon;
import com.example.springdatajpa.coupondataacesslayer.repository.CouponRepository;

@Component
public class CouponService implements CommandLineRunner {

	@Autowired
	private CouponRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Coupon(1,"SuperSales",new BigDecimal(20),"12/12/2024"));
		repository.save(new Coupon(2,"SuperSale",new BigDecimal(30),"11/12/2024"));
		System.out.println(repository.findById(1l));
		System.out.println("record with Supersale"+repository.findByCouponCode("SuperSales"));
	}

}

package com.example.springdatajpa.coupondataacesslayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatajpa.coupondataacesslayer.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long>{

	
	Coupon findByCouponCode(String code);
	
}

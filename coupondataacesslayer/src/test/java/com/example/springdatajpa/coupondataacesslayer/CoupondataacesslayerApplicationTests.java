package com.example.springdatajpa.coupondataacesslayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdatajpa.coupondataacesslayer.model.Coupon;
import com.example.springdatajpa.coupondataacesslayer.repository.CouponRepository;

@SpringBootTest
class CoupondataacesslayerApplicationTests {

	@Autowired
	private CouponRepository repository;
	
	@Test
	void saveRecordToDbSuccess() {
		 Coupon coupon = new Coupon();
		 coupon.setId(1);
		 coupon.setCouponCode("SuperSale");
		 coupon.setExpDate("12/12/2024");
		 coupon.setDiscount(new BigDecimal(29));
		 repository.save(coupon);
	}

	@Test
	void getRecordByCouponCode() {
		Coupon coupon = repository.findByCouponCode("SuperSale");
		assertEquals(30, coupon.getDiscount().intValue());
	}
}

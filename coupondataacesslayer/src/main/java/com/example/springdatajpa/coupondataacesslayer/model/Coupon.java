package com.example.springdatajpa.coupondataacesslayer.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Coupon {

    @Id
	private long     Id;
	private String   couponCode;
	private BigDecimal discount;
	private String   expDate;
	
	public Coupon() {
		
	}
	
	public Coupon(long id, String couponCode, BigDecimal discount, String expDate) {
		super();
		Id = id;
		this.couponCode = couponCode;
		this.discount = discount;
		this.expDate = expDate;
	}
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
	@Override
	public String toString() {
		return "Coupon [Id=" + Id + ", couponCode=" + couponCode + ", discount=" + discount + ", expDate=" + expDate
				+ "]";
	}
	
	
	
	
}

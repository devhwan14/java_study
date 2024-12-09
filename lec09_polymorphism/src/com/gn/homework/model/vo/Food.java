package com.gn.homework.model.vo;

public class Food extends Product{
	private int expirationDays;
	
	public Food() {}
	
	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expirationDays = expirationDays;
	}
	
	public int getExpirationDays() {
		return expirationDays;
	}
	
	public int calculateDiscountRate() {
		if(expirationDays>10) {
			return 100;
		} else if(expirationDays>5) {
			return 80;
		} else if(expirationDays>1) {
			return 50;
		} else {
			return 20;
		}
	}
	
	public int calculatePrice() {
		return super.getPrice()*calculateDiscountRate()/100;
	}

}

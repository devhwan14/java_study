package com.gn.practice07.model.vo;

public class Supplement {
	private String name;
	private int dosage;
	private int price;
	
	public Supplement() {}
	
	public Supplement(String name, int dosage, int price) {
		this.name = name;
		this.dosage = dosage;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDosage() {
		return dosage;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void information() {
		System.out.println("이름 : "+name);
		System.out.println("복용량 : "+dosage+"알");
		System.out.println("가격 : "+price+"원");
	}

}

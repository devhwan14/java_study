package com.gn.practice05.model.vo;

public class Book {
	private String title; // 도서명
	private String publisher; // 출판사
	private String author; // 작가
	private int price; // 가격
	private double discountRate; // 할인율
	
	 //기본 생성자
	public Book() {}

	// 매개변수가 3개있는 생성자
	public Book(String title,int price,String author) {
		this.title = title;
		this.price = price;
		this.author = author;
	}
	 //매개변수가 5개있는 생성자
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}	
	
	// 매소드 -> 출력기능
	public void information() {
		System.out.println("==="+title+"===");
		System.out.println("저자 : "+author);
		System.out.println("출판사 : "+publisher);
		System.out.println("가격 : "+price);
		System.out.println("할인율 : "+discountRate);
	}
}

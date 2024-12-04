package com.gn.study.method.model.vo;

public class Library {
	// 1. 책 빌리기
	public void borrowBooks(String...books) {
		System.out.println("===대출할 책 목록===");
		for(String book : books) {
			System.out.println("- "+book);
		}
	}
	// 2. 빌린 책 반납하기
	public void returnBooks(int lateFee,String...books) {
		System.out.println("총 연체료 : "+lateFee);
		for(String book : books) {
			System.out.println("- "+book);
		}
	}
}

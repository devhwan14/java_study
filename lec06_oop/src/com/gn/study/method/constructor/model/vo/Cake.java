package com.gn.study.method.constructor.model.vo;

public class Cake {
	public String flavor = "Choco";
	
	public static int price = 27000;
	
	{flavor="딸기";}
	static {price = 32000;}
	
	public Cake() {
		this.flavor = "녹차";
		// this.price = 40000;
		// 클래스 변수는 생성자를 이용한 초기화가 없다.
	}
}
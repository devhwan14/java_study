package com.gn.study.model.vo;

public class Parent {
	private int a;
	
	public int getA() {
		return a;
	}
	//1.자식은 부모의 기본 생성자를 무조건 호출해서 기본 생성자를 필수적으로 만들어 둬야함
//	public Parent() {}
	
	public Parent (int a) {
		this.a = a;
		System.out.println("부모 매개변수 생성자 지롱");
	}

}

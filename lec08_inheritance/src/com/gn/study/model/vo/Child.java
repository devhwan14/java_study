package com.gn.study.model.vo;

public class Child extends Parent{
	private int b;
	
	public Child () {
		//부모의 기본생성자가 없을때 호출하는 메서드 super();
		super(3);
		System.out.println("자식 기본 생성자 호출!!");
	}
	public Child(int a, int b) {
		super(a);
		this.b = b;
		System.out.println("자식 매개변수 생성자 호출~~");
	}
}
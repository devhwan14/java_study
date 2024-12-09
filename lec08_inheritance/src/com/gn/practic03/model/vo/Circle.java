package com.gn.practic03.model.vo;

public class Circle extends Point {
	private int radius;
	private static final double PI=3.14;
	
	// 기본 생성자
	public Circle() {}
	
	// 매게변수 생성자
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
		
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	@Override
	public void draw() {
//		Circle c = new Circle();
//		c.draw();
		super.draw();
		System.out.println("면적 : "+(PI*radius*radius));
		System.out.println("둘레 : "+(PI*radius*2));
		 
	}

}

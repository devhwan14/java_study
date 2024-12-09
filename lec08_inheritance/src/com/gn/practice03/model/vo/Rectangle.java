package com.gn.practice03.model.vo;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	// 기본 생성자
	public Rectangle() {}
	
	// 매게변수 생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth(){
		return width;
	}
	public int getheight() {
		return height;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("면적 :  "+(width*height));
		System.out.println("둘레 : "+(2*(width+height)));
	}

}

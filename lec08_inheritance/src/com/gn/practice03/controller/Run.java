package com.gn.practice03.controller;

import com.gn.practice03.model.vo.Circle;
import com.gn.practice03.model.vo.Rectangle;

public class Run {
	public static void main(String[] args) {
		Circle[] arr1 = new Circle[2];
		arr1[0] = new Circle(1,2,3);
		arr1[1] = new Circle(3,3,4);
		
		System.out.println("=== circle ===");
		for(Circle c : arr1) {
			c.draw();
		}
		
		Rectangle[] arr2 = new Rectangle[2];
		arr2[0] = new Rectangle(-1,-2,5,2);
		arr2[1] = new Rectangle(-2,5,2,8);
		System.out.println("=== rectangle ===");
		for(Rectangle r : arr2) {
			r.draw();
		}
	}
}

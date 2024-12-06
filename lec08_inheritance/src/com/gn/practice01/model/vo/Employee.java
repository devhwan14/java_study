package com.gn.practice01.model.vo;

public class Employee {
	private String name;
	
	public Employee() {}
	
	public Employee(String name) {
		this.name = name;
	}
	public void printInfo(String name) {
		System.out.println("직원 이름 : "+name);
	}
}

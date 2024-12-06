package com.gn.practice01.model.vo;

public class Manager extends Employee {
	private String department;
	
	public Manager() {}
	
	public Manager(String name, String department) {
		this.department = department;
	}
	
	public void printDeaprtment(String department) {
		System.out.println("부서 정보 : "+department);
	}

}

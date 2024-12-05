package com.gn.study.method.constructor.model.vo;

public class Student {
	// 학생 번호 조회
	public void printInfo(int num) {
		System.out.println("당신의 번호는 "+num+"입니다.");
	}
	
	// 학생 이름 조회
	public void printInfo(String name) {
		System.out.println("당신의 이름은 "+name+"입니다.");
	}

	// 학생 번호, 이름 조회
	public void printInfo(int num,String name) {
		System.out.println(name+"님의 학번은"+num+"입니다.");
	}
	// 이름, 번호 조회
	public void printInfo(String name, int num) {
		
	}
	// 학생 나이 조회
//	public void printInfo(int age) int의 매소드가 이미 존재
}

package com.gn.study.method.capsule;

public class Student {
	//캡슐화 1번 필드는 private하게 쓴다
	private int studentNo;
	
	public Student(int studentNo) {
		this.studentNo = studentNo;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	

}

package com.gn.homework05.model.vo;

public class Member {
	
	private String memberld;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member(String memberld,String memberPwd,
					String memberName, int age, char gender, String phone,
					 String email) {
		this.memberld = memberld;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		
	}
	public String getMemberld() {
		return memberld;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public int getMemberName() {
		return age;
	}
	public char getgender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
	public void changName(String name) {
		
	}
	
	public void printName() {
		
	}

}

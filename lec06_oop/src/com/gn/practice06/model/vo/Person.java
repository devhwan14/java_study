package com.gn.practice06.model.vo;

public class Person {
	
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
//	//기본생성자
//	public Person() {}
//	
//	//매채변수 생성자
//	public Person(String id, String pwd, String name,
//			int age, char gender, String phone, String email) {
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//		this.phone = phone;
//		this.email = email;
//	}
	
//	public String getid () {
//		return id;
//	}
//	public String getpwd () {
//		return pwd;
//	}
//	public String getname() {
//		return name;
//	}
//	public int getage() {
//		return age;
//	}
//	public char getgender() {
//		return gender;
//	}
//	public String getphone() {
//		return phone;
//	}
//	public String getemail() {
//		return email;
//	}
	public void SetId(String id) {
		this.id = id;
	}
	public void SetPwd(String pwd) {
		this.pwd = pwd;
	}
	public void SetName(String name) {
		this.name = name;
	}
	public void SetAge(int age) {
		this.age = age;
	}
	public void SetGender(char gender) {
		this.gender = gender;
	}
	public void SetPhone(String phone) {
		this.phone = phone;
	}
	public void SetEmail(String email) {
		this.email = email;
	}
	
	public String infomation() {
	   return "";
	}

}

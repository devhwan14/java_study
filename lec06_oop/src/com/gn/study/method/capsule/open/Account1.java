package com.gn.study.method.capsule.open;

//getter, setter 사용X
public class Account1 {
	public String user; // 소유주
	public int balance; // 잔액
	
	// 기본 생성자
	public Account1() {}
	
	//매개변수 생성자
	public Account1(String user, int balance) {
		this.user = user;
		this.balance = balance;
	}

}

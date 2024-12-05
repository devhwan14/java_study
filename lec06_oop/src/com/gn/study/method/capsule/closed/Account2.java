package com.gn.study.method.capsule.closed;

//getter,setter 사용 O
public class Account2 {
	private String user;
	private int balance;
	
	public Account2() {}
	
	public Account2(String user, int balance) {
		this.user = user;
		this.balance = balance;
	}
	public String getUser() {
		return user;
	}
	public int getbalance() {
		return balance;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	public void setbalance(int balance) {
		if(balance < 0) {
			System.out.println("출금이 불가능합니다");
		} else {
		this.balance = balance;
		}
	}

}

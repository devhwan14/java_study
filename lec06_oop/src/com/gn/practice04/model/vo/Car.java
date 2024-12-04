package com.gn.practice04.model.vo;

public class Car {
	// 1. 시동 켜기
	public void startEngine () {
		System.out.println("자동차 시동이 켜졌습니다.");
	}
	// 2.속도 확인하기
	public int checkSpeed() {
		return 50;
	}
	// 3.속도 설정하기
	public void setSpeed(int speed) {
		System.out.println("속도가"+speed+"Km/h로 설정되었습니다.");
	}
	// 4.여행 목적지 설정하기
	public String setDestination(String destination) {
		return "목적지가 설정 되었습니다 : "+destination;
	}
}

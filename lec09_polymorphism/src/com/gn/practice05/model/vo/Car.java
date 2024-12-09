package com.gn.practice05.model.vo;

public class Car implements Machine, Vehicle{
	
	@Override
	public void turnOn() {
		System.out.println("자동차 시동을 겁니다.");
	}
	public void turnOff() {
		System.out.println("자동차 시동을 끕니다.");
	}
	public void speedUp() {
		System.out.println("자동차 속도를 높입니다.");
	}
	public void speedDown() {
		System.out.println("자동차 속도를 줄입니다.");
	}

}

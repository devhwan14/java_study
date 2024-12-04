package com.gn.practice04.controller;

import com.gn.practice04.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		Car mycar = new Car();
		
		// 1.시동 켜기
		mycar.startEngine();
		
		// 2.속도 확인하기
		int speed = mycar.checkSpeed();
		System.out.println("속도 : "+speed);
		
		// 3. 속도 설정하기
		mycar.setSpeed(80);
		
		//4. 목적지 설정하기
		String result = mycar.setDestination("서울");
		System.out.println(result);
	}

}

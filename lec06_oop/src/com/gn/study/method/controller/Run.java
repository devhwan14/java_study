package com.gn.study.method.controller;

import com.gn.study.method.model.vo.Smartphone;

public class Run {
	public static void main(String[] args) {
		// 객체 생성
		// 인스턴스화
		Smartphone myPhone = new Smartphone();
		
		// 1. 반환형X,매개변수x
		myPhone.openApp();
		
		// 2. 반환형O,매개변수X
		int battery = myPhone.checkBattery();
		System.out.println("잔량 베터리 : "+battery);
		
//		System.out.println(myPhone.checkBattery());
		
		// 3. 반환형X,매개변수O
		myPhone.setVolume(15);;
		
		// 4. 반환형O,매개변수O
		String result = myPhone.sendMsg("자니?");
		System.out.println(result);
	}

}

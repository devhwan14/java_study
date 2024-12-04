package com.gn.study.method.controller;

import com.gn.study.method.model.vo.Hospital;
import com.gn.study.method.model.vo.Library;
import com.gn.study.method.model.vo.Smartphone;

public class Run {
	public static void main(String[] args) {
		// 객체 생성
		// 인스턴스화
		Smartphone myPhone = new Smartphone();
		
		System.out.println("===============");
		myPhone.checkwork();
		System.out.println("===============");
		
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

	
		//객체화
		Library library = new Library();
		
		library.borrowBooks("해리포터","반지의 제왕","채식주의자");
		library.returnBooks(1000,"1984","파친코");
		
		// 객체화
		Hospital hospital = new Hospital();
		
		hospital.emergencyCall();
//		hospital.doctorCall();
//		hospital.staffAnnoucement();
//		hospital.personalRecord();
	 
		// 인스턴스를 생성하지 않고 메소드 호출 가능
		Hospital.hospitalInfo();
//		hospital.hospitalInfo();
		Math.random();
		
		
	}
}

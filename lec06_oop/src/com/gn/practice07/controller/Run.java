package com.gn.practice07.controller;

import com.gn.practice07.model.vo.Supplement;

public class Run {
	public static void main(String[] args) {
		//선언
		Supplement[] ac;
		//선언 후 생성
		ac = new Supplement[4];
		//초기화
		Supplement[] ac1 = {new Supplement("유산균",1,18000),
				new Supplement("비타민B",1,15000),
				new Supplement("루테인",2,20000),
				new Supplement("비타민D",1,12000)};
		//출력
		for(int i = 0; i < ac1.length; i++) {
			System.out.println(ac[i].getName());
			System.out.println(ac[i].getDosage());
			System.out.println(ac[i].getPrice());
		}
	}
}
		
		

	




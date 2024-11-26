package com_gn.study;

public class Test {
	// 메인 메소드
//	라인 주석입니다.
//	메소드 : 일꾼(블록사이)	
//	  블록 주석 여러줄 주석 가능
	 
	public static void main(String[] args) {
		System.out.println("Hello World");
		// 1. print -> 줄바꾸기 X print(ln) ln은 줄바꿈을 할때 사용
		System.out.print("Hello World");
		System.out.print(123);
		// 2.println -> 줄바꾸기 O
		System.out.println("Hello World");
		System.out.println(123);
		// 3.printf(표현식,데이터)
		// 3. printf -> 형식화(숫자,날짜)된 출력을 할 때 사용 System.out.printf(표현식,데이터);
		// %d : 정수 , %f : 실수 , %s : 문자열
		// 이름 : 김철수, 나이 : 25, 키 : 179.8
		System.out.printf("이름 : %s, 나이 : %d, 키 : %.1f",
				"김철수",25,179.83);
		
		// 이스케이프 문자
		// "안녕하세요."
		System.out.println("안녕하세요.");
		System.out.printf("\"안녕하세요\"");
		// hello와 world 사이에 줄 바꾸기
	    System.out.println("hello \nworld");
	    
	}
}

package com.gn.study;

public class Loopstmt {
	public static void main(String[] args) {
		// 1 ~ 10까지 숫자 모두 출력
		// 초기식 -> 출발점(1)
		// 조건식 -> 도착점(10)
		// 증감식 -> step(몇걸음씩)
		// for(초기식; 조건식; 증감식){}
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i);
		}
		
		
		// 2. 초기식 생략
		int a = 1;
		for(; a <= 5 ; a++) {
			System.out.println(a);
		}
		
		// 무한루프
		// 3. 조건식 생략
		for(int i = 1;  ; i++) {
			System.out.println(i);
			if(i >= 10 ) {
				break;
			}
		}
		//8. do~while문
		int count1 = 10;
		while(count1 > 0 && count1 < 10) {
			System.out.println("while문 출력");
			count1--;
		}

		int count2 = 10;
		do {
			System.out.println("do~while문 출력");
			count2--;
		}while(count2 > 0 && count2 < 10);
		
		// 9. continue
		for(int i = 1; i <= 10 ; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		String str = "김철수";
		for(int i = 0 ; i < str.length() ; i++)
			System.out.println(str.charAt(i));
			// 특정 문자가 공백일 때 -> 문자 == ' '
		}		

}			



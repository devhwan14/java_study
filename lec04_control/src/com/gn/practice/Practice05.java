package com.gn.practice;

public class Practice05 {
	public static void main(String[] args) {
		//정수형 변수 i가 1일때부터 시작해서 9보다 작거나 같을 때까지 1씩 커지면서 반복합니다.
		//매 사이클에 i와 7을 곱한 값을 출력해서 예시와 같이 출력되는 프로그램을 만들어보세요.
		System.out.println("=== 7단 ===");
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println("7 * "+i+" = "+(7 * i));
		}
	}

}

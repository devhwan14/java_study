package com.gn.homework.test;

import java.util.Scanner;

//기능 메소드
public class Practice {
    // 1번 기능 : 인사말 출력
    public void practice01( ) {
    	System.out.println("안녕하세요~");
    }
    // 2번 기능 : 두개의 숫자를 입력 받아서 합 출력
    public void practice02() {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
        int b = sc.nextInt();
    	System.out.println(a+b);
    	sc.close();
    }
    // 3번 기능 : 1~50까지의 짝수 합 구하기
    public void practice03() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("정수 : ");
    	int num = sc.nextInt();
    	for(int i = 0; i <= 50; i++) {
    		if(i>=50) {
    			System.out.println("1~50사이의 정수를 입력하세요.");
    		}
    		if(i<=50) {
    		
    		}
    		System.out.println("합계 : "+num);
    	}
    }
}

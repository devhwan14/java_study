package com.gn.homework.loop;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 입력 하세요 : ");
		System.out.println("1. 1~50까지 짝수 합하기");
		
		
		System.out.println("선택 : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				//1~50까지 짝수 합하기
				new Practice().practice01();
				break;
			}
		
	}
	
}

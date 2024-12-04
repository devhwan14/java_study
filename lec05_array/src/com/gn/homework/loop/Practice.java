package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	// 1~50까지 짝수 합하기
	public void practice01() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("정수(1~50) : " );
			int num = sc.nextInt();
			int sum = 0;
			for(int i = 1; i <= num; i++) {
				if(i%2 == 0) {
					sum += i;
				}else {
					continue;
				}
				System.out.println("합계 : "+sum);
				break;
			} else {
				System.out.println("1~50 사이의 정수를 입력하세요.");
			}
		}
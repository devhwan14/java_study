package com.gn.practice;

public class Practice06 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; ; i++) { 
			sum += i;
			if(sum >= 100) {
				System.out.println(sum);
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
		
		
		}
		
	}

		
		

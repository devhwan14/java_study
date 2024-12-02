package com.gn.practice;

import java.util.Scanner;

public class Pratice10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		do {
			System.out.println(num);
			num++;
		}while(num <= 10);
	}

}

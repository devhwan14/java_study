package com.gn.practice;

public class Practice02 {
	public static void main(String[] args) {
		
		int[] numbers = {-62,107,-12,89,-35};
		// for each 문
//		for(int i = 0; i < numbers.length; i++) {
//			if(numbers[i] > 50 ) {
//			System.out.println(numbers[i]);
			 		
		for(int num:numbers) {
			if(num>50) {
				System.out.println(num);
			}
		}
		}
	}


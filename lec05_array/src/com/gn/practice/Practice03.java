package com.gn.practice;

public class Practice03 {
	public static void main(String[] args) {
		int[] attend = {1,1,1,1,1,0,1,0,0,1};
		int sum = 0;
		for(int at : attend) {
			sum += at;			
		}
		System.out.println("출석한 학생의 수 : " +sum);
		System.out.println("결석한 학생의 수 : " +(attend.length-sum));
		
	}

}
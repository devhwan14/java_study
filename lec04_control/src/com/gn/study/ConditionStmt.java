package com.gn.study;

public class ConditionStmt {
	public static void main(String[] args) {
		//5. switch 문
		int day = 2; // 화요일
		// 오늘은 0요일 입니다.
		String text = "";
		switch(day) {
			case 0 : 
				text = "일";
				break; // 들여쓰기를 하는 이유는 정리하기 쉽게 하기 위함
			case 1 : 
				text = "월";
				break;
			case 2 : 
				text = "화";
				break;
			default :
				text = "모르는"; 
				break;
		}
		System.out.println(text+"요일 입니다.");
		
		// 조건 여려개가 수행하는 기능이 같은 경우
		int month = 7;
		switch(month) { 
		case 1,3,5,7,8,10,12 : System.out.println("31일");break;
		case 4:case 6:case 9: case 11:System.out.println("30일");break;
		case 2: System.out.println("29일");break;
		default:System.out.println("존재하지 않는 달입니다.");break;
		}
		
	}
	
}

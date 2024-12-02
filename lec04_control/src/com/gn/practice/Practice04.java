package com.gn.practice;

public class Practice04 {
	public static void main(String[] args) {
		int light = 5;
		switch(light) {
		case 0 : System.out.println("조명을 끕니다.");break;
		case 1 : System.out.println("어두운 조명입니다.");break;
		case 2 : System.out.println("밝은 조명입니다.");break;
		case 3 : System.out.println("매우 밝은 조명입니다.");break;
		default : System.out.println("올바른 입력이 아닙니다.");break;
		}
	}

}

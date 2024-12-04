package com.gn.practice;

public class Practice01 {
	public static void main(String[] args) {
		// 철수는 친구들의 이름을 배열에 넣고 싶어졌어요.
		// 친구들 이름이 아래와 같다고 할떄,
		// 친구들의 이름을 담고 있는 배열 friends를 구성하세요.
		// 박지영, 김태우, 이지훈, 최유진 , 정승호
		// 인덱스, 선언과 동시에 초기화를 하던가
		
//		String[] friends = new String[5];
//		friends[0] = "박지영";
//		friends[1] = "김태우";
//		friends[2] = "이지훈";
//		friends[3] = "최유진";
//		friends[4] = "정승호";
		
//		String[] friends = new String[]{"박지영","김태우","이지훈","이지훈","최유진","정승호"};
//		
//		String[] friends = {"박지영","김태우","이지훈","이지훈","최유진","정승호"};
		
//		1 : 박지영
//		2 : 김태우
//		3 : 이지훈
//		4 : 최유진
//		5 : 정승호
		
		String[] friends = {"박지영","김태우","이지훈","최유진","정승호"};
		for(int i = 0 ; i < friends.length ; i++) {
			if((i+1) % 2 != 0) {
				System.out.println((i+1)+" : "+friends[i]);
			}
		}
		
	}
		
}

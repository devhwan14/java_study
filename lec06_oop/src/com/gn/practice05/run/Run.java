package com.gn.practice05.run;

import com.gn.practice05.model.vo.Book;
import com.gn.study.method.constructor.model.vo.Student;
// 1. 실행용 매소드
// 2. 기본생성자와 매개변수 3개인 생성자,
// 매개변수 5개인 생성자를 통해 각각의 객체 생성
// 3. information() 메소드를 통해 초기화한 정보 출력
public class Run {
	// final -> 대문자
	// static -> 밑줄
	// +main(args:String[]):void
	// + = public 
	public static void main(String[] args) {
		// 기본 생성자 -> 객체 생성

		Book b1 = new Book();
		b1.information();
		// 매개변수 3개 생성자 -> 객체 생성
		
		Book b2 = new Book("홍길동전",5000,"허균");
		b2.information();
		
		// 매개변수 5개 생성자 -> 객체 생성
		
		Book b3 = new Book("채소 과일 레시피","터치아트,","박경희",19300,0.1);
		b3.information();
		
		String[] students = {"김철수","이영희","홍길동"};
		for(int i = 0 ; i <students.length; i++) {
			Student s = new Student();
			s.printInfo(i);
			s.printInfo(students[i]);
			s.printInfo(i,students[i]);
		}
		
	}
	
}

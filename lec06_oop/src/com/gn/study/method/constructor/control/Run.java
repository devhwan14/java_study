package com.gn.study.method.constructor.control;

import com.gn.study.method.constructor.model.vo.Book;
import com.gn.study.method.constructor.model.vo.Cake;
import com.gn.study.method.constructor.model.vo.Car;
import com.gn.study.method.constructor.model.vo.Student;

public class Run {
		public static void main(String[] args) {
			// 기본생성자
			Car c1 = new Car();
			
			// 매개변수 생성자
			Car c2 = new Car("현대","회색",2024);
			
			// Run 클래스에 Book 개체 생성하기
			Book b1 = new Book(15900);
			Book b2 = new Book(20000);
			
			String[] students = {"김철수","이영희","홍길동"};
			for(int i = 0 ; i <students.length; i++) {
				Student s = new Student();
				s.printInfo(i);
				s.printInfo(students[i]);
				s.printInfo(i,students[i]);
			}
			
			System.out.println("==========케이크============");
			Cake c = new Cake();
			//인스턴스변수
			//4.변수 기본값
			//3.명시적 초기화
			//2.초기화 블록
			//1.생성자를 이용한 초기화
			System.out.println(c.flavor);
			
			// 클래스 변수(static)
			//4. 변수 기본값
			//3. 명시적 초기화
			//2. 초기화 블록
			//1. 생성자를 이용한 초기화(사용 안함)
			System.out.println(c.price);
		}
		

	}





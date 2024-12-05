package com.gn.study.method.constructor.control;

import com.gn.study.method.constructor.model.vo.Book;
import com.gn.study.method.constructor.model.vo.Car;

public class Run {
		public static void main(String[] args) {
			// 기본생성자
			Car c1 = new Car();
			
			// 매개변수 생성자
			Car c2 = new Car("현대","회색",2024);
			
			// Run 클래스에 Book 개체 생성하기
			Book b1 = new Book(15900);
			Book b2 = new Book(20000);
		}

	}





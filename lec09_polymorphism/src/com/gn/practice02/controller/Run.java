package com.gn.practice02.controller;

import com.gn.practice02.model.vo.SchoolMember;
import com.gn.practice02.model.vo.Staff;
import com.gn.practice02.model.vo.Student;
import com.gn.practice02.model.vo.Teacher;

public class Run {
	public static void main(String[] args) {
		SchoolMember[] arr = new SchoolMember[3];
		arr[0] = new Student();
		arr[1] = new Teacher();
		arr[2] = new Staff();
		
//		SchoolMember sm = new SchoolMember();
//		arr[0] = sm;
//		
//		Student s = new Student();
//		arr[1] = s;
//		
//		Teacher t = new Teacher();
//		arr[2] = t;
//		
//		Staff st = new Staff();
//		arr[3] = st;
//		
		for(SchoolMember a : arr) {
			a.introduce();
			if(a instanceof Student) {
				((Student)a).study();
			}
			else if(a instanceof Teacher) {
				((Teacher)a).teach();
			}
			else if(a instanceof Staff) {
				((Staff)a).work();
			}
		}
				
	}
}

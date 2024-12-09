package pracitice01.controller;

import pracitice01.model.vo.Employee;
import pracitice01.model.vo.Person;
import pracitice01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		Person p1 = new Employee();
		Person p2 = new Student();
		
		p1.introduce();
		p2.introduce();
		
		Person[] arr = new Person[3];
		
		Person pe = new Person();
		arr[0] = pe;
		
		Employee ep = new Employee();
		arr[1] = ep;
		
		Student s = new Student();
		arr[2] = s;
		
		for(Person p : arr) {
			p.introduce();
		}
	}
}

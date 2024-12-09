package com.gn.practice05.run;

import com.gn.practice05.model.vo.Car;
import com.gn.practice05.model.vo.Machine;
import com.gn.practice05.model.vo.Vehicle;

public class Run {
	public static void main(String[] args) {
		Machine a = new Car();
		Vehicle b = new Car();
		a.turnOn();
		a.turnOff();
		b.speedUp();
		b.speedDown();
	}

}

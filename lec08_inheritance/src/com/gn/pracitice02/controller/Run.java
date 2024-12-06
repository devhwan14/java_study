package com.gn.pracitice02.controller;

import com.gn.pracitice02.model.vo.Appliance;
import com.gn.pracitice02.model.vo.Refrigerator;
import com.gn.pracitice02.model.vo.WashingMachine;

public class Run {
	public static void main(String[] args) {
		Appliance a = new Appliance();
		a.turnOn();
		WashingMachine wm = new WashingMachine();
		wm.turnOn();
		Refrigerator rf = new Refrigerator();
		rf.turnOn();
	}
}

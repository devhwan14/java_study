package com.gn.practice04.controller;

import com.gn.practice04.model.vo.LoginMenu;

public class AppController {
	public void startMyapp() {
		LoginMenu a = new LoginMenu();
		a.display();
		a.input();
		a.close();
	}
	

}

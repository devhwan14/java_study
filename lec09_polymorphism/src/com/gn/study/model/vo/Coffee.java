package com.gn.study.model.vo;

public class Coffee extends Beverage{
	@Override
	public void drink() {
		System.out.println("잠이 번쩍!!");
	}
	
	public void ice() {
		System.out.println("얼죽아");
	}
}

package com.gn.study.model.vo;

public class FireAlarm implements Alarm{
	@Override
	public void soundAlarm() {
		System.out.println("불이 났어요! 대피하세요!");
	}

}

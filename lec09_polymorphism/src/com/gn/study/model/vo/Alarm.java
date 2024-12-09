package com.gn.study.model.vo;

public interface Alarm {
	// 상수 필드 -> public static final 생략 가능
	// 상수 -> 변수명 대문자, 스네이크 케이스
	public static final int MAX_VOLUME = 10;
	// int MAX_VOLUME = 10;
	// 추상 메소드 -> public abstract 생략 가능
	public abstract void soundAlarm();
	// void soundAlarm();
	
}

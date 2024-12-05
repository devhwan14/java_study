package com.gn.study.method.constructor.model.vo;
//오버 로딩
public class Test {
	public void test(int i) {}
	// 1번,2번
	public void test(String str){}             // 1번
	public void test(int i, String str){}      // 2번
	//public void test(int num){}                // 3번
	//public char test(int point){}              // 4번
	public void test(int i, int k){}           // 5번
	//public void test(int num, String string){} // 6번
	public void test(String str, int i){}      // 7번
}

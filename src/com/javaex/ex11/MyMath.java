package com.javaex.ex11;

public class MyMath {

	private static double PI = 3.14;
	//필드 생략
	
	//생성자 생략 -> 디폴스 생성자 사용
	
	//메소드 getter / setter -> 생략(필드가 없으니) 
	
	//메소드 일반
	public static int puls(int a, int b) {
		return a + b;
	}
	
	public static double puls(double a, double b) {
		return a + b;
	}
	
	public static double circle(double r) {
		return r*r*PI;
	}
	
}

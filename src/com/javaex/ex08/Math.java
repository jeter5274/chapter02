package com.javaex.ex08;

// 메소드 오버로딩 예제

public class Math {
	
	//필드 → 생략

	//생성자 → 생략 (생략하지만 기본 생성자는 자동으로 생성됨)
	
	//메소드 getter, setter → 필드가 없으므로, 생략
	
	//메소드 일반 메소드
	public int puls(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public double puls(double a, double b) {
		double sum = a + b;
		return sum;
	}
}

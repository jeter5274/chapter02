package com.javaex.ex02;

public class Point {
	
	//캡슐화 private
	private int x, y;
	
	//x좌표 setter
	public void setX(int a) {
		x = a;
	}
	
	//x좌표 getter
	public int getX() {
		return x;
	}
	
	//x좌표 setter
	public void setY(int a) {
		y = a;
	}
	
	//x좌표 getter
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[x=" +x+ ", y=" +y+ "]를 그렸습니다.");
	}
}

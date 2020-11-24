package com.javaex.ex02;

public class Point {
	
	//필드, 캡슐화 private
	private int x, y;
	
	//생성자
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//x좌표 setter
	public void setX(int x) {
		this.x = x;
	}
	
	//x좌표 getter
	public int getX() {
		return x;
	}
	
	//x좌표 setter
	public void setY(int y) {
		this.y = y;
	}
	
	//x좌표 getter
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[x=" +x+ ", y=" +y+ "]를 그렸습니다.");
	}
}

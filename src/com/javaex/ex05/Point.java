package com.javaex.ex05;

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
	
	public Point(int x) {
		this.x = x;
	}
	
	/* 사용할 수 없다 : 매개변수가 동일한 형태의 동일한 갯수로, 위 생성자와 중복된다.
	public Point(int y) {
		this.y = y;
	}
	*/
	
	//메소드
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void draw() {
		System.out.println("점[x=" +x+ ", y=" +y+ "]를 그렸습니다.");
	}
}

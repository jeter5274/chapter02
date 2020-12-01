package com.javaex.ex18;

public class ColorPoint extends Point{
	
	//필드
	private String color;
	
	//생성자
	public ColorPoint() {}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	//메소드 getter/setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println("포인트 : " +super.getX()+ ", " +super.getY()+ ", 색상 : " +color);
	}

	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
	
	
	
	
}

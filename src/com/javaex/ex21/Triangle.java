package com.javaex.ex21;

public class Triangle extends Shape {

	//필드
	private int width;
	private int height;
	private int heightPoint;
	
	//생성자
	public Triangle(){}

	public Triangle(String fillColor, String lineColor, int width, int height, int heightPoint){
	    super(fillColor, lineColor);
	    this.width = width;
	    this.height = height;
	    this.heightPoint = heightPoint;
	}

	//메소드 getter/setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeightPoint() {
		return heightPoint;
	}

	public void setHeightPoint(int heightPoint) {
		this.heightPoint = heightPoint;
	}
	
	//메소드 일반
	public void draw(){
	    System.out.println("[삼각형] 면색 : " +super.fillColor+ ", 선색 : " +super.lineColor+ ", 밑변 : " +width+ ", 높이 : " +height+ ", 높이 위치 : " +heightPoint);
	}

	public double area(){
	    return (width*height)/2;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", heightPoint=" + heightPoint + ", getFillColor()="
				+ getFillColor() + ", getLineColor()=" + getLineColor() + "]";
	}

}

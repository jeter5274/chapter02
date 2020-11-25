package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		
		//생성자 Point()
		//setter 사용
		//showInfo() 확인
		Point p1 = new Point();
		
		p1.setX(5);
		p1.setY(5); 
		
		p1.draw();

		
		//생성자 Point(int x, int y)
		//setter 사용하지 않음
		//showInfo() 확인
		Point p2 = new Point(10, 23);
		p2.draw();
		
		
		//생성자 Point(int x)
		//setY만 사용
		//showInfo() 확인
		Point p3 = new Point(3);
		p3.setY(19);	
		
		p3.draw();
	
	}

}

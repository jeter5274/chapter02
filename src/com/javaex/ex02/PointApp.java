package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		//p1
		Point p1 = new Point();
				
		/*
		p1.x =2;
		p1.y =2;
		//캡슐화
		//메소드를 만들기
		
		//p1 p2 p3 p4 출력하기
		*/
		
		p1.setX(5); //p1의 x좌표를 5로 set
		p1.setY(5); //p1의 y좌표를 5로 set
		
		//System.out.println(p1.getX()); //p1의 x좌표 입력 확인
		//System.out.println(p1.getY()); //p1의 y좌표 입력 확인
		
		p1.draw();
		
		//p2
		Point p2 = new Point();
		
		p2.setX(10); //p2의 x좌표를 10으로 set
		p2.setY(23); //p2의 y좌표를 23으로 set	
		p2.draw();
		
		//p3
		Point p3 = new Point();
		
		p3.setX(3);
		p3.setY(19);	
		p3.draw();
		
		//p4
		Point p4 = new Point();
		
		p4.setX(12);
		p4.setY(15);	
		p4.draw();
		
		
	}

}

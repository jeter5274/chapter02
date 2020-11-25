package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point();
		p01.setX(3);
		p01.setY(5);
		System.out.println(p01.toString());
		
		p01.draw();
		
		Point p02 = new Point(100, 100);
		
		p02.draw();
		p02.draw(true);
		p02.draw(false);
		//위 3개 라인의 메소드가 같아보이지만 다름
		
	}

}

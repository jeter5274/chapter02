package com.javaex.ex18;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01 = new Point(4, 5);
		Point p02 = new Point(254, 255);
		Point p03 = new Point(1, 2);
		ColorPoint cp01 = new ColorPoint(20, 30, "red");
		ColorPoint cp02 = new ColorPoint(10, 10, "blue");
		
		Point[] cpArray = new Point[5];
		
		cpArray[0] = p01;
		cpArray[1] = p02;
		cpArray[2] = p03;
		cpArray[3] = cp01;	//자동 upcasting
		cpArray[4] = cp02;	//자동 upcasting

		for(int i=0; i<cpArray.length; i++) {
			cpArray[i].showInfo();	
		}
		
		Point udc01 = cpArray[4];	//자료형 같아서 문제없음
		Point udc02 = (ColorPoint)cpArray[4];	//자동 upcasting
		ColorPoint udc03 = (ColorPoint)cpArray[4];	//downcasting

	}

}

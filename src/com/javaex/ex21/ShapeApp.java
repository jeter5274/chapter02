package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape[] sArray = new Shape[3];

	    Shape r01 = new Ractangle("빨강", "주황", 10, 20);
	    Shape c01 = new Circle("노랑", "파랑", 30);
	    Shape t01 = new Triangle("남색", "보라", 10, 20, 4);

	    sArray[0] = r01;
	    sArray[1] = c01;
	    sArray[2] = t01;

	    for(int i=0; i<sArray.length; i++){
	    	sArray[i].draw();
	        System.out.println("면적 : " +sArray[i].area());
	    }
		

	}

}

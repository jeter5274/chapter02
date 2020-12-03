package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		//테스트		
		Point p = new Point(3,3);
		p.draw();

		Drawable pp = new Point(4,4);
		pp.draw();
		*/
		//점 + 도형 함께 관리
		Drawable[] dArray = new Drawable[4];
		
		Drawable r01 = new Ractangle("빨강", "주황", 10, 20);
		Drawable c01 = new Circle("노랑", "파랑", 30);
		Drawable t01 = new Triangle("남색", "보라", 10, 20, 4);
		Drawable p01 = new Point(5,5);
		
		dArray[0] = r01;
	    dArray[1] = c01;
	    dArray[2] = t01;
	    dArray[3] = p01;
	    
	    //전체 그리기
	    for(int i=0; i<dArray.length; i++){
	    	dArray[i].draw();
	    }
		
	    System.out.println("면적구하기=============================");
	    //전체면적 출력 -> Point는 면적이 없음
	    //순차적으로 area() 부모가 shape이면 면적을 출력
	    for(int i=0; i<dArray.length; i++){
	    	if(dArray[i] instanceof Shape) {
	    	System.out.println(((Shape)dArray[i]).area());
	    	}
	    }
	}

}

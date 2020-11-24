package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		
		/*
		//캡슐화 떄문에 사용 불가
		camera.name = "니콘";
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		*/
		
		//카메라
		camera.setName("니콘");
		/*
		//이름이 잘 들어 갔는지 확인
		String cameraName = camera.getName();
		System.out.println(cameraName);
		*/
		
		camera.setPrice(400000);
		/*
		//가격이 잘 들어 갔는지 확인
		int cameraPrice = camera.getPrice();
		System.out.println(cameraPrice);
		*/
		
		//System.out.println("상품이름 : " +cameraName+ ",  가격 : " +cameraPrice);
		camera.showInfo();
		
		
		
		//노트북
		Goods computer = new Goods();
		
		computer.setName("LG그램");
		/*
		//이름이 잘 들어 갔는지 확인
		String computerName = computer.getName();
		System.out.println(computerName);
		*/
		
		computer.setPrice(1000000);
		/*
		//가격이 잘 들어 갔는지 확인
		int computerPrice = computer.getPrice();
		System.out.println(computerPrice);
		*/
	
		//System.out.println("상품이름 : " +computerName+ ",  가격 : " +computerPrice);
		computer.showInfo();
		
		
		
		
		//머그컵
		Goods cup = new Goods();
		
		cup.setName("머그컵");
		/*
		//이름이 잘 들어 갔는지 확인
		String cupName = cup.getName();
		System.out.println(cupName);
		*/
		
		cup.setPrice(2000);
		/*
		//가격이 잘 들어 갔는지 확인
		int cupPrice = cup.getPrice();
		System.out.println(cupPrice);
		*/
		
		//System.out.println("상품이름 : " +cupName+ ",  가격 : " +cupPrice);
		cup.showInfo();
		
		Goods food = new Goods("가정식 백반", 6000);
		food.showInfo();
		/*
		//캡슐화 전
		Goods computer = new Goods();
		computer.name = "LG그램";
		computer.price = 1000000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		
		camera.price = 450000;
		System.out.println(camera.name);
		System.out.println(camera.price);
		*/
	}

}

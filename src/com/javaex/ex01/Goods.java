package com.javaex.ex01;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() {
		
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	//메소드
	
	//setName 이름 등록
	public void setName(String name) {
		this.name = name; //"니콘", "LG그램", "머그컵" ⋯
		//this.xxx는 이 클래스 내 필드에 있는 변수를 의미함
	}
	
	//getName 이름 읽기
	public String getName() {
		return name;
	}
	
	//setPrice 가격 등록
	public void setPrice(int price) {
		this.price = price;
	}
	
	//getPrice 가격 읽기
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("상품이름 : " +name+ ",  가격 : " +price);
	}
}

package com.javaex.ex14;

public class Person {
	
	//필드
	protected String name;
	protected int age;
	
	//생성자
	public Person() {}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//메소드 - getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

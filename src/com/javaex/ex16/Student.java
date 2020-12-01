package com.javaex.ex16;

public class Student extends Person {

	//필드
	private String schoolName;

	//생성자
	public Student() {}

	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}

	//메소드 getter/setter
	public String getSchool() {
		return schoolName;
	}

	public void setSchool(String schoolName) {
		this.schoolName = schoolName;
	}

	//메소드 일반
	public void showInfo() {
		System.out.println("이름 : " +super.getName()+ ", 나이 : " +super.getAge()+ ", 학교 : " +schoolName);
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	
	
	
}

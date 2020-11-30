package com.javaex.ex14;

public class Student extends Person{

	//필드
	private String schoolName;

	//생성자
	public Student() {	}

	public Student(String name, int age, String schoolName) {
		//메모리에 올리는 작업
		//person(); 부모쪽 디폴트 생성자가 자동 실행
		//super(); 부모쪽 디폴트 생성자를 집적 실행
		super(name, age); //매개변수가 포함되어, 초기값이 있는 부모생성자 실행
		
		/*
		//부모 setter 활용
		super.setName(name);
		super.setAge(age);
		*/
		this.schoolName = schoolName;
		
		/*
		1. 자신의 생성자가 시작됨 -> 완료X
		2. 부모의 생성자 호출
			- 부모의 생성자를 선택 가능
			- 선택을 하지 않을 경우 디폴트 생성자가 실행
		3. 부모의 생성자 작업이 끝나면 자신의 생성자 작업을 완료
		 */
	}
	/*
	public Student(String schoolName) {
		//person(); 부모쪽 디폴트 생성자 실행
		this.schoolName = schoolName;
	}
	*/

	//메소드 - getter/setter
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//메소드 - 일반																																										
	public void showInfo() {
		System.out.println("이름 : " +getName()+ ", 나이 : " +getAge()+ ", 학교 : " + schoolName);
		System.out.println("이름 : " +name+ ", 나이 : " +age+ ", 학교 : " + schoolName);
	}
	
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	
	
	
	
}

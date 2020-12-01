package com.javaex.ex17;

public class PersonApp {

	public static void main(String[] args) {
		
		/*오버라이딩 테스트
		//테스트 -> 섞어쓰기 : 자료형을 통일하되, 학교정보를 유지하고 싶음
		Person s01 = new Student("유재석", 44, "서울고등학교");
		
		//자식쪽(Student)의 정보를 사용할 수 없음
		//s01.getSchoolName();을 사용할 수 없음
		
		s01.showInfo();	//자식쪽(Student)의 showInfo()가 실행됨 / 오버라이딩
		//부모쪽의 showInfo()를 사용할거라 생각이 된다. X
		
		System.out.println(s01.toString()); //오버라이딩
		
		*/
		Person[] psArray = new Person[5];
		
		Person p01 = new Person("둘리", 1200);
		Person p02 = new Person("도우너", 200);
		Person p03 = new Person("마이콜", 300);
		Person s01 = new Student("유재석", 44, "서울고등학교");
		Person s02 = new Student("강호동", 47, "경기고등학교");
		
		psArray[0] = p01;
		psArray[1] = p02;
		psArray[2] = p03;
		psArray[3] = s01;
		psArray[4] = s02;
		
		for(int i=0; i<psArray.length; i++) {
			psArray[i].showInfo();
		}
		
		System.out.println("=========================================");
		System.out.println(((Student)psArray[3]).getSchoolName());
		((Student)psArray[4]).setSchoolName("마산고등학교");
		
		for(int i=0; i<psArray.length; i++) {
			psArray[i].showInfo();
		}
		
		Person t01 = psArray[3];
		//Student t02 = psArray[4]; //오류 : 양쪽의 자료형이 다름
		Student t03 = (Student)psArray[4];	//psArray[4]를 다운캐스팅 해야함 (Person -> Student)
		Person t04 = (Student)psArray[4];	//자동으로 업캐스팅이 됨, 굳이 명시한다면 (Person)((Student)psArray[4])
	}

}

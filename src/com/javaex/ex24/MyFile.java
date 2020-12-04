package com.javaex.ex24;

import java.io.IOException;

public class MyFile {

	//필드
	
	//생성자
	
	//메소드 getter/setter
	
	//메소드 일반
	
	//상황1
	public String fileRead(String path) throws IOException{
		//텍스트 파일을 읽어서 글자를 String으로 리턴해준다
		//복잡한 로직이라고 가정
		throw new IOException();
	}
	
	//상황2
	public String fileRead2(String path) throws IOException{
		//텍스트 파일을 읽어서 글자를 String으로 리턴해준다
		//복잡한 로직이라고 가정
		//파일이 없을을 경우
		
		throw new IOException(); //파일을 못찾은 경우
		//예외상황이 발생인지
		//처리 방법은 결정할 수 없다.  사용하는 쪽에서 결정
	}
}

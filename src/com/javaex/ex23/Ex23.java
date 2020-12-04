package com.javaex.ex23;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		try {
			//실행하고자 하는 코드
			double sum = 100 / num;
			System.out.println(sum);
		}catch(ArithmeticException e) {
			//조건에 해당하는 예외가 발생하였을 경우
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			//무조건 출력
			System.out.println("정상처리");
		}
		

		sc.close();
	}

}

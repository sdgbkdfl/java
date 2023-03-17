package bmi;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
	while(true) {
		
		Scanner scan = new Scanner(System.in);
		//(참조형)타입             //생성 //클래스명(타입과 동일)
		
		
		//키 입력하라고 하기
		//몸무게 입력하라고 하기
		//bmi 알랴주기
		//결과 통보
		System.out.println("==BMI==");
		System.out.println("키를 입력해주실?(m) : ");
		Double height = scan.nextDouble();
		
		System.out.println("몸무게를 입력해주실?(kg) : ");
		Double weight = scan.nextDouble();
		
		Double bmi = weight / (height*height);
		System.out.printf("당신의 bmi는 %.2f 입니다\n", bmi);
		
		if(bmi<=18.5) {
			System.out.println("저체중");
			
		} else if (bmi<=22.9) {
			System.out.println("정상");
		} else if (bmi<=24.9) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		System.out.println("==========");
		
		System.out.println("종료:q");
		// 문자열로 반복 탈출 => .equals()메소드
		String line = scan.next();
		if(line.equals("q")) {
			break;
		}
		
	}

	  }


		
		
		
		
}




		

	
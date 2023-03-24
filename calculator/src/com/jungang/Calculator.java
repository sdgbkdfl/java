package com.jungang;

public class Calculator {
	
	//필드
	//접근제한자를 붙이지 않으면  default
	String name;
	//Private : 외부로부터 클래스를 보호하는 접근제한자

   //메소드생성 : 접근제한자 반환타입 메소드명(매개변수타입 변수명) {}
   //정수의 합계를 구하는 메소드 두 수를 입력받아 두 수의 합을 반환
	/**
	 * 두개의 정수를 입력받아 합을 반환
	 * @param num1
	 * @param num2
	 * @return num1+num2
	 */
	public int add(int num1, int num2){
		return num1+num2; //반환
	}
	 
   //생성자의 특징 1 클래스의 이름과 동일한 이름, 2 반환 타입이 없다
   //생성자 :
	
   //new 연산자를 만나서 객체가 생성될때 실행	 
   //calculator 로 생성자 연습 
	 public Calculator() {
		 name = "정수계산기";
		 System.out.println(name);
	 }

}

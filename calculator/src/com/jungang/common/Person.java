package com.jungang.common;
//230323
public class Person {  //패키지 클래스명
	//필드
	protected String name;  
	public int age;
	public double height;
	public double weight;;
	
	//기본생성자 : 초기화를 담당
	//클래스명과 같은 이름, 반환 타입 없음
	public Person() {
		//다른 생성자를 호출
		//초기화값을 직접입력
		this("정우성",30,190.3,100); //생성자에서 다른 생성자 호출 (매개변수로 넘어온 값만 사용가능, 필드값 사용할 수 없음)
	}
	public Person(String name, int age, double height, double weight) {
	//초기화
	this.name =name;
	this.age = age;
	this.height = height;
	this.weight =weight;
	}
	
	//접근제한자 반환타입 메서드명(매개변수 타입, 매개변수명)
	/**
	 * 이름과 나이를 반환
	 * @return 이름, 나이
	 */
	public String information() {
		return name+","+age;
	}
}

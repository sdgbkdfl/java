package com.jungang.common;

public class PersonMain {

	public static void main(String[] args) {
		//객체생성 -> new연산자 (new Person();)
		//사용위해 변수에 담아줌(Person person)
		//f3눌러서 어떤 생성자가 실행되는지 확인 가능
		Person person = new Person();
		Person hong = new Person("홍길동", 20,175,70.7);
		
		System.out.println(person.information());
		System.out.println(hong.information());
		
		Person[] personArr = new Person[5];
		//매개변수에 타입과 변수 갯수가 일치해야지만 호출할 수 있다
		//                  생성자   매개변수    
		personArr[0] = new Person("김지민", 20,0,0);
		personArr[1] = new Person("한지민", 50,0,0);
		personArr[2] = new Person("전지현", 80,0,0);
		personArr[3] = new Person("송혜교", 300,0,0);
		personArr[4] = new Person("김태희", 40,0,0);
		//생성된 객체(new Person)를 personArr에 넣어줌	
		
		//personArr에 담긴 객체?를 p에 각 각 넣어서 출력해줌
		//타입(배열에 들어있는 타입:Person) 변수명 : 배열
		for(Person p : personArr) {
			System.out.println(p.information());
			System.out.println("----------------");
		}
	}

}

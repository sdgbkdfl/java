package com.stringEx;
// 문자열 추출하기

public class StringEx1 {
	public static void main(String[] args) {
		//7번째 인덱스의 문자체크해서   
		//1,3이면 남자 2,4이면 여자
		String ssn = "123456-529123";
		
		//charAt(7)
		//해당 인덱스의 문자를 char 타입으로 반환
		if(ssn.charAt(7)== '1'||ssn.charAt(7)==3) {
			System.out.println("남성");
		}else if(ssn.charAt(7)== '2'||ssn.charAt(7)==4) {
			System.out.println("여성");
			
		}else {
			System.out.println("잘못된 값 입니다.");
		}
			System.out.println(ssn.charAt(7));
	}
}

package com.wrapperEx;

public class WrapperEx {

	public static void main(String[] args) {
		//박싱 : 기본타입 -> 참조타입
		//래퍼 클래ㅑ스로 감싸주는거
		//자동형변환
		
		Integer obj1 = new Integer(100);
		Integer obj2 = 100;
		Integer obj3 = new Integer("300");
		Integer obj4 = Integer.valueOf("300");
		
		System.out.println("Integer : 박싱");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		
		//언박싱 : 참조타입 -> 기본 타입
		//강제형변환
		int int1 = obj1.intValue();
		int int2 =(int)obj1;
		
		//연산시에는 자동형변환 
		int int3 = obj4 +100; //자동 언박싱
		System.out.println("int :언박싱");
		System.out.println(int1);
		System.out.println(int2);
		
		//포장 값 비교
		////-128~127(1바이트)초과할 경우
		Integer obj_integer1 = 300;
		Integer obj_integer2 = 300;
		
		System.out.println("비교결과:"+ (obj_integer1 == obj_integer2) );
		System.out.println("비교결과:"+ (obj_integer1.equals(obj_integer2)));
		System.out.println("비교결과:"+ (obj_integer1.intValue() == obj_integer2.intValue()));
		
		//-128~127(1바이트)내의 범위라면 == 이용시에도 같음
		
	
		
		
	}

}

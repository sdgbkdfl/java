package com.jungang;

public abstract class Animal {
 //필드
	private String name;
	private String kinds;
	
//생성자
	protected Animal() {
		//protected 패키지가 달라도 자식이면 접근 가능
	}
	protected Animal(String name, String kinds) {
		//초기화
		this.name = name;   //셋팅
		this.kinds = kinds; 
		//값 사용중이면 클릭했을때 회색 박스뜸
	}
//메소드				
	@Override	
	public String toString() {
		return "저의 이름은"+ name+"이고, 종류는"+" "+kinds+"입니다";
		//문자열 반환
	
}
	public abstract void speak() ;
	//클래스가 추상메서드를 포함할 경우 추상 클래스가 되어야함
	}
	


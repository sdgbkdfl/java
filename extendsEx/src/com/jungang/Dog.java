package com.jungang;

public class Dog extends Animal {
	//상수로 만들어주기 ->  static final
	public static final String PLACE = "애견카페";
	private int weight;
	
	//생성자
	public Dog() {
		
	}
	public Dog(String name, String kinds, int weight) {
		//초기화
		super(name,kinds); //부모 생성자 호출
		setWeight(weight); //getter setter로 객체 생성해서 호출
	
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public void speak() {
		//부모의 메서드 호출
		System.out.println(super.toString()+"몸무게는"+weight+"kg입니다");
		
		//String str =super.toString();
		//	System.out.println(str+"몸무게는"+weight+"kg입니다");
		//변수 만들어주고 출력도 가능
		
	}

	
	
}

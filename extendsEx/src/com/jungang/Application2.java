package com.jungang;

public class Application2 {

	public static void main(String[] args) {
		
		Animal[] animalArry = new Animal[5];
		//애니멀에 임폹 떠야하는데 안뜸
		
		//각 인덱스에 무작위로 dog, cat객체로 생성
		//이때 매개뱐수 생성자를 이용해서 생성
		Dog dog = new Dog("멍멍이", "말라뮤트", 25);
		Cat cat = new Cat("야옹이", "치즈냥", "구로구", "검정");
		
		
		//0~4까지 돌며
		//배열의 각 방에 고양이 또는 강아지 입력
		for(int i=0; i<5;i++) {
			int index =(int)(Math.random()*2+1);
			if(index==1) {
				//배열이름[방번호]
				animalArry[i] = dog;				
			}else {
				animalArry[i] = cat;				
			}
			
		}
		for(Animal a : animalArry) {
			//자식 객체에서 재정의(오버라이딩)되어진 메서드가 호출
			a.speak()
			;
		}
		
	}

}

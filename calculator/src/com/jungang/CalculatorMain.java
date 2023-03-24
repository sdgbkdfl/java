package com.jungang;

public class CalculatorMain {

	public static void main(String[] args) {
		//메모리에 올리는 키워드 new
		//Calculator 객체 생성 후 주소값 반환
		//계산기 사용하기 위해서 변수에 담아 줘야함
        Calculator calc = new Calculator();
        System.out.println("============");
        
        //. :주소접근연산자
        System.out.println(calc.add(5, 7));
        
        //재사용할땐 변수에 담아줌, 정해진 타입 필히 작성
        int addRes = calc.add(5, 7);
        
        
        
        
       
	}

}

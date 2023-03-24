package calc;
//230323
public class CalculatormMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.powerOn();
		//오류 발생
		//매개변수의 타입과 갯수가 일치하지 않을때 
		//이름이 다른 경우
		int res = calc.add(5, 5);
		System.out.println(res);
		
//---------------------------------------------------------
		
		//배열 생성 후 메서드에 파라메터로 전달
		int[] numbers = {1,2,3,4,5};
		System.out.println("calc.add(numbers):"+calc.add(numbers));
		
		//메서드를 실행할때 배열을 생성
		System.out.println("calc.add(new int[] {1,2,3}):"+ calc.add(new int[] {1,2,3}));
		//calc.add(new int[] {1,2,3});

		System.out.println("calc.addFn"+calc.addFn(1,2,3,4,5,6,7));
		
	}

}

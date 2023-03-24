package exam06;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator(); //객체의 초기화
		 						//기본 생성자
		//정사각형 넓이
		double rectagle = calc.areaRectangle(10); //필드값?
		System.out.println("정사각형의 넓이:"+rectagle);
		
		//직사각형의 넓이		
		System.out.println("직사각형의 넓이:"+calc.areaRectangle(10, 20));

	}

}

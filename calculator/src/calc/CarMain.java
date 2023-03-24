package calc;

public class CarMain {
//
////	public static void main(String[] args) {
//		Car car = new Car(10); 
//		car.run1();	
//		
		
		car.run();
		
		//반횐타입이 boolean 타입이므로 if 문 조건에 입력가능
		if(car.isLeftGas()) {
			System.out.println("주유하십시오");
		}
		{
			System.out.println("남은 기름의 양 "+car.gas);
		}
		
		
	}

}

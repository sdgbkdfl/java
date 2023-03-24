package car.object;

public class Person {

	public static void main(String[] args) {
	
		
		//필드에 접근해서 값 변경
		Car car = new Car();
		car.company = "르노삼성";
		System.out.println("company:" + car.company);
		System.out.println("speed:" + car.speed);
		car.speedUP();
		System.out.println("car.speedup()");
		
		car.speed = 100;
		System.out.println("car.speed = 100");
		System.out.println("speed :  " +car.speed);
	}
		
}


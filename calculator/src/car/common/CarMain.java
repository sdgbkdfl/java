package car.common;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//생성자를 호출할 때는 생성자의 매개변수타입에 맞춰서 순서대로 입력해줘야 함
		Car car = new Car();
		System.out.println("car=============");
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxspeed);

		Car car1 = new Car("그랜져");
		System.out.println("car1============");
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxspeed);
		
		Car car2 = new Car("SM5","그린",200);
		System.out.println("car2============");
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxspeed);
		
		Car car3 = new Car("소나타", "블랙", 200);
		System.out.println("car3============");
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.maxspeed);
		
		

	}	

}

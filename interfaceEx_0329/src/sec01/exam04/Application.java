package sec01.exam04;

public class Application {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();  //출력
		
		myCar.BL = new KumhoTire();
		myCar.BR = new KumhoTire();
		
		myCar.run();  //바퀴 교체 후 출력
		

	}

}

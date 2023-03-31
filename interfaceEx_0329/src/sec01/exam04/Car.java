package sec01.exam04;

public class Car {
	//인터페이스 타입 필드 선언과 초기 구현 객체 대입
	Tire FL = new HankookTire();
	Tire FR = new HankookTire();
	Tire BL = new HankookTire();
	Tire BR = new HankookTire();
	
	void run() {
		//인터페이스에서 설명된 roll()메소드 호출
		FL.roll();
		FR.roll();
		BL.roll();
		BR.roll();
	}
	
}

package sec02.exam04;

public class Driver {
	void drive(Vehicle vehicle) {
		
		
		//강제 타입변환 가능한 경우!▽
		//vehicle을 상속받아 구현된 객체가 매개변수로 입력된 경우
		//부모타입으로 자동 형변환된 경우
		//Bus bus =(bus) vehicle;
		
		//new 연산자에 의해 본래 생성된 타입 확인!
		//부모타입이 자식 타입으로 강제 캐스팅 됡 경우 오류 발생
		if(vehicle instanceof Bus) { 
			Bus bus =(Bus)vehicle;
			System.out.println("Bus타입으로 변환 성공");
		}else {
			System.out.println("Bus타입으로 변환 불가넝");
		}
		
		
		vehicle.run();
	}
}

package sec03.exam01;

public class Application {

	public static void main(String[] args) {
//		Phone phone = new Phone(); ->생성불가
		//추상클래스는 생성할 수 없다.
		//미완성된 메소드를 포함하고 있다면 생성 불가
		
		//추상클래스를 상속받아 추상 메서드를 모두 구현하면
		//일반클래스로 생성가능
		SmartPhone sp = new SmartPhone("owner");
		
		//참조형 변수의 타입으로 사용 가능 -> 다형성 활용가능
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();

	}

}

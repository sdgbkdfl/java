package speed;
//클래스 외부에서 메소드 호출
//230323
public class Car {
	//필드 -> 속성정의
	//정수 speed;
	public int speed;
	
	
	//생성자 -> new 연산자에 의해 객체를 생성할 때 호출
	// 1 기본생성자
	public Car() {}
	
	
	// 2 speed를 매개변수로 받는 생성자
	
	public Car(int speed);
	//메소드 -> 기능을 정의
	//getSpeed():int
	public int getSpeed() {
		return speed;
	}
	//keyTurnOnOP():void
	public void keyturnonop() {
		System.out.println("시동을 켭니다");
	}
	//run():void
	//속도를 10씩 증가 시키면서 50까지 속도 출력
	public void run() {
		for(int i =0;i<50;i++) {			
			System.out.println("i:"+i);
			speed=i;
			System.out.println("시속:"+speed +"km/h");
		}

	}
	public static void main(String[] args) {
		Car car = new Car(); //객체 생성
		car.keyturnonop();
		car.run();
		int speed = car.getSpeed();
		System.out.println("시속:" +speed +"km/h");
	}
}

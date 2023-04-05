package sec01.exam02;

import sec01.exam01.Audio;
import sec01.exam01.RemoteControl;
import sec01.exam01.SmartTV;

public class Application {
	RemoteControl rc = null;
	public static void main(String[] args) {
		
		Myclass myclass = new Myclass(null);
		
		//1. 인터페이스가 필드에 사용된 경우
		//myclass가 가진 필드에 접근해서 메소드 호출(smartTV생성되어 있음)
		//smartTV로 확인
		myclass.rc.turnOn();
		myclass.rc.setVolume(15);
		myclass.rc.turnOff();
		
		//필드에 새로운 객체를 생성하여 저장 가능
		myclass.rc = new Audio();
		myclass.rc.turnOn();
		myclass.rc.setVolume(15);
		myclass.rc.turnOff();
	
		
		System.out.println("=====================");
		
		//3. 인터페이스가 메소드의 매개변수로 이용된 경우
		//기본 생성자로 생성하면 rc =new SmartTV();
		//필드의 선언부에서 생성하고 있습니다
		//메서드 호출시 구현 객체를 매개값으로 대입
		Myclass myclass2 = new Myclass(new SmartTV());
		myclass2.methodB(new Audio());
		myclass2.rc.turnOn();
		myclass2.rc.setVolume(15);
		myclass2.rc.turnOff();
		
		Myclass myclass3 = new Myclass(new Audio());
		//4. 메서드에 선언된 로컬변수를 rc에 저장
		myclass3.methodA();
		myclass3.rc.turnOn();
		myclass3.rc.setVolume(15);
		myclass3.rc.turnOff();
		
	}

}

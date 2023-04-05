package sec01.exam02;
//인터페이스로 구현 객체 사용
import sec01.exam01.Audio;
import sec01.exam01.RemoteControl;
import sec01.exam01.SmartTV;

	public class Myclass {
	//인터페이스는 생성할 수 없다
	//필드, 생성자의 매개변수나
	//메소드의 매개변수, 메소드의 로컬 변수로 선언 가능
	//->다형성	
		
	//필드
	
	//1. 필드의 타입으로 인터페이스가 선언된 경우
	//->필드에 구현 객체(SmartTV())사용 가능
	RemoteControl rc = new SmartTV();
	//ctrl shift o
	
	//생성자
	
	//2. 인터페이스가 생성자의 매개 변수 타입으로 사용될 경우
	//->new연산자로 객체를 생성할 때 구현 객체를 생성자의 매개값으로 대입할 수 있음
	public Myclass(RemoteControl rc) {
		//매개변수로 받아온 rc 를 필드에 저장
		this.rc = rc;
	}
	
	//메소드
	public void methodA() {
	//3.인터페이스(RemoteControl)가 지역 변수 타입으로 사용될 경우
	//->변수에 구현객체를 대입
	RemoteControl rc = new Audio();
			
		}
	//4.인터페이스가 메소드의 매개변수 타입으로 사용될 경우,
	//->메소드 호출 시 구현객체(new Audio())를 매개값으로 대입 가능
	public void methodB(RemoteControl rc) {
			
	}
	
	
}

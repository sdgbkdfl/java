package sec03.exam01;

public class SmartPhone extends Phone {
	//생성자
	public SmartPhone(String owner)	{
		super(owner);
	}

	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
	//상속받은 추상메소드를 모두 구현해야 일반 클래스가 될 수 있다
	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다");		
	}
	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다");		
	}

}

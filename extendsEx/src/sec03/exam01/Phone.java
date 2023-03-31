package sec03.exam01;

public abstract class Phone {
	//추상클래스
	//추상메소드를 하나라도 포함하고 있으면 추상 클래스가 된다
	//추상메소드가 없어도 abstract키워드를 선언하므로써 추상클래스가 된다
	//추상클래스는 생성이 불가능하다
	//따라서 상속 클래스에 미완성 코드를 구현하여 일반클래스로 구현.
	
	
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner)	{
		this.owner = owner;
	}
	//메소드
	//코드블럭이 미완성 상태
	public abstract void turnOn();
	
	//하위 클래스에게 작성을 강제한다
	//미완성된 메서드를 구현해야 일반 클래스로 작성이 가능하다
	public abstract void turnOff();

}

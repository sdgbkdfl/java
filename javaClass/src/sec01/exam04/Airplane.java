package sec01.exam04;

//final키워드 : 부모 클래스가 될 수 없다
// public final class Airplane{
public class Airplane {

	public Airplane() {
		
	}
	public void land() {
		System.out.println("착륙");
	}
	public void fly() {
		System.out.println("일반비행");
	}
	public void takeOff() {
		System.out.println("이륙");
	}
	
}
//파이널 키워드가 메소드에 붙었을때 재정의 할 수 없다

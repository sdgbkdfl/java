package sec03.exam02;

//추상메서드를 하나라고 포함할 경우 추상클래스가 됨
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	public void print(Animal animal) {
		System.out.println("print-------");
		animal.sound();
		System.out.println(animal.kind);
		System.out.println("print-------");
	}
	
	//추상메소드 - 코드블럭이 미완성됨
	public abstract void sound();
}

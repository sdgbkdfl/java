package sec01.exam05;

public class Main {

	public static void main(String[] args) {
		//상속 받은 자식 클래스는 부모타입으로 자동 형변환 할 수 있다.
		Cat cat = new Cat();
		Animal animal =cat;
		
		Animal animal2 = new Cat();
		
		//최상위객체 0 모든 객체는 object를 상속받는다
		Object object = animal;
	}

}

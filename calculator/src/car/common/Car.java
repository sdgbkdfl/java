package car.common;

public class Car {
	//생성자의 오버로딩
	
	//필드 생성
	String model;
	String color; 
	int maxspeed;		
	
	
	//매개변수의 타입, 갯수, 순서가 다르게 여러개를 선언
	//생성자의 특징 1 클래스와 동일 타입명 2 반환하지 않음
	//생성자로 객체 초기화	
	public Car() { //기본생성자
		//this.  : 필드
		//this()  : 생성자
		//생성자를 사용하기 위하여 매개변수에 알맞은 파라매터를 입력 
		//생성자에서 다른 생성자를 호출 -> 중복되는 코드 줄이기 위해서		
	this("기본모델","블랙",150); //null값 나오지 않도록 변수값 부여
}
	
	public Car(String model) {
		//내가 가진 필드에 매개변수에 넘어 온 값을 입력해달라는 주문
		//코드블럭 안에서는 로컬변수가 우선되므로 의미 없음
		//순서는 상관없음
		//this.model = model;
	this(model,"블랙",150); //초기화 해주고 싶은 값을 입력
		//this를 이용하여 생성자 호출
	}
	
	public Car(String model, String color) {
		//생성자를 호출하는 것은 첫번째줄에서만 가능
		this(model, color, 150);	
	}
	
	public Car(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;		
	}
	
//	public Car(String model, int maxspeed) {
//		this.model = model;
//		this.maxspeed = maxspeed;
//	}
	

	
	
}

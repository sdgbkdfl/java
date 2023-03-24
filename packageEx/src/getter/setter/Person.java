package getter.setter;

public class Person {
	static final double PI = 3.14159;
	static final double EARTH_RADIUS = 6400;
	
	// 상수 : 한번 값이 정해지고 나면 수정 불가
	
	
	final String nation = "Korea";
	final String ssn;
	String name;

	
	//생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
		//상수는 값을 변경하는 것 불가능
		//상수는 대문자로 작성하는 것이 원칙
		this.ssn = "12345";
		this.name = "강동원";
	}
}

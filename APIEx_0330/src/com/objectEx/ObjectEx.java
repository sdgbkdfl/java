package com.objectEx;

public class ObjectEx {

	public static void main(String[] args) {
		String str = ""; //=>Object(형변환)
		print(str);
		System.out.println("===============================");
		int num =0; // Integer=>Object
		//int타입은 기본타입이므로 object 타입으로 변환되지 못합니다.
		//int 타입을 객체형태로 변환해야합니다. 
		//==> wrapper클래스인 integer타입으로 자동 형변환 되어져서 들어감
		// 자동형변환
		//int -> Integer
		//double -> Double
		//기본타입 : 값 자체를 저장
		//참조타입 : 주소를 저장
		//num.
		print(num);
		System.out.println("===============================");
		
		ObjectEx object = new ObjectEx();
		print(object);
		//static있기 때문에 출력가능
		
		str.toString();
//		Integer.toString();
	}
	//참조타입의 최상위 계층 -Object 모든 객체의 부모
	public static void print(Object obj) {
		//Object클래스에 toString이 정의되어 있지만
		//메서드의 오버라이딩에 의해서
		// String의 클래스 Integer에 정의되어 있는 클래스 호출
		//클래스이름@16진수주소값을 반환
	
		System.out.println(obj.toString());
		
		//두 객체가 가지고 있는 주소값을 비교
		//주소가 같으면 트류, 다르면 펄즈
		obj.equals(new Object());
		//근데 사실 주소값 같은지 알아보고 싶은거 아님 
		//그래서 재정의해서 사용함
	
}
}



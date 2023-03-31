package sec01.exam04;

public class Main {

	public static void main(String[] args) {
		//부모타입으로 자식 객체를 생성
		//자동 형변환
		Airplane airplane = new SupersonicAirplane(SupersonicAirplane.SUPERSONIC);
		
		
		
		//부모타입으로 변환될 경우 
		//부모가 가지고 있는 필드 또는 메소드에만 접근이 가능
		//재정의 메소드 호출시 - 자식 클래스에서 재정의한 메서드가 호출
		System.out.println("재정의 메소드 호출");
		airplane.fly();
				
		//=>자식타입으로 형변환 ->강제형변환
		SupersonicAirplane supersonic = (SupersonicAirplane)airplane;
		//원래타입으로 변환시
		//자식 클래스가 가지고 있는 필드 또는 메소드에 접근 가능
		supersonic.booster();
		
		System.out.println(supersonic.flyMode);
		

	}

}

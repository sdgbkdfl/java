package sec02.exam03;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		//부모가 가진 생성자를 호출
		//생성자를 만들면 기본 생성자 생성되지 않음
		super(location, maxRotation + 2);
		
	}
//메소드의 오버라이드(메소드의 재정의)
	@Override
	public boolean roll() {
		rotation++; //타이어 1회전
		System.out.println("금호타이어"+location+" " + "누적회전수:"+rotation);
		System.out.println("금호타이어"+location+" "+ "최대회전수:"+maxRotation);
			
		if(rotation >= maxRotation) {
			//바퀴교체 알림
			return false;
			}
		return true;
		
	}
}


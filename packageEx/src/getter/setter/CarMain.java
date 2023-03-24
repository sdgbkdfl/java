package getter.setter;

public class CarMain {
public static void main(String[] args) {
	Car car = new Car(); //객체 생성
	
	// Private 접근제한자 경우
	// 필드에 직접 접근 불가하므로
	//setter메서드를 이용해서 필드의 값을 변경 시켜줄 수 있음
	
	car.setSpeed(-50); //마이너스 50넣었지만 유효값 아니라 0으로 출력
	//어떤 값을 유효한 상태로 입력해주기 위해 게터 세터 메소드 사용
	System.out.println("현재 속도는 "+car.getSpeed());
	
	car.setSpeed(50);
	System.out.println("현재 속도는 "+car.getSpeed());
	
	//멈춤 : true/ 생성됐을때 :false
	//멈추지 않은 상태일 경우 멈추는 메소드를 호출
	//상태확인
	if(!car.isStop()) {
		car.setStop(true);
	}
	
	car.setStop(true);
	System.out.println("현재 속도는 "+car.getSpeed());
	}
}

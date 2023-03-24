package calc;

public class Car {
	
	public int gas;
	
	// 생성자 : gas 초기화	
	//값을 받아와야함 ->매개변수 선언
	Car(int gas){
		this.gas = gas;
	}
	//달립니다 출력
	public void run1() {
		System.out.println("달립니다");
		//내부 메소드 호출 (런을 호출하며 아래 스탑과 사운드도 같이 호출되길 바람)
		stop();
		//이름, 매개변수의 갯수. 타입이 일치하는 메소드를 찾아서 실행
		sound();
	}
	//멈춥니다 출력
	public void stop() {
		System.out.println("멈춥니다");	
	}

	
 	//sound 빵빵 출력
	public void sound() {
		System.out.println("빵빵");
	}
	
	
	//boolean 타입이 반환인 경우 메서드의 이름에 is가  붙는 경우 많다
	//기름이 0이면 false 반환
	public boolean isLeftGas() {
	//기름의 양 확인 ->필드에 있는 값으로 판단	
		
		while(true) {
			if(gas >0) {
			//gas-= 1;//gas = gas-1
				gas--;
			
				System.out.println("달립니다");
				System.out.println("남은 기름양:"+gas);
			
		}else {
			System.out.println("기름이 떨어졌어요");
			System.out.println("남은기름양:"+gas);
		}
		
		}
	}// while문 종료
}


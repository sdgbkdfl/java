package sec02.exam03;

public class Car  {
	//바퀴 네개
	//초기값 null
	private Tire tireFR;
	private Tire tireFL;
	private Tire tireBR;
	private Tire tireBL;

	public Car(){
		//생성자
		//타이어 필드를 초기화. 타이어 위치
		tireFR = new Tire ("FR",3);
		tireFL = new Tire ("FL",5);
		tireBR = new Tire ("BR",1);
		tireBL = new Tire ("BL",10);
	}
	/**
	 * 바퀴를 굴려줍니다
	 * @return
	 */
	
	public int run() {
		System.out.println("운행합니다.");
		
		boolean next = tireFR.roll();
		if(!next) {
			
			System.out.println(tireFR.location+"타이어 교체");
//			tire = new Tire(null, 3);
			//금호타이어로 바꾸고 싶을때 아래처럼 작성
			//상속 관계에 있어야 교체 가능
			return 1;
			//다형성에 의해 자식객체는 부모의 타입으로 자동 형변환된다.
		}
		if(!tireFL.roll()) {
			System.out.println(tireFL.location+"교체");
			return 2;
					
		}
		if(!tireBR.roll()) {
			System.out.println(tireBR.location+"교체");
			return 3;
	}
		if(!tireBL.roll()) {
			System.out.println(tireBL.location+"교체");
			return 4;
		}
		return 0;
	}
	/**
	 * 바퀴의 위치를 매개변수로
	 * 
	 * @param location
	 */
	
	public void changeTire(int location) {
		//switch문 이용하여 바퀴 교체 
		
	switch (location) {
	
	case 1:	
		tireFR = new KumhoTire(tireFR.location, 5);
		
		break;
	case 2:
		tireFL = new KumhoTire(tireFL.location,3);
		
		break;
	case 3:
		tireBR = new KumhoTire(tireBR.location,1);
		
		break;
	case 4:
		tireBL = new KumhoTire(tireBL.location,10);
		
		break;

	
	}	}
	
}

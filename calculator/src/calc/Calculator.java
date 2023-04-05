package calc;
//230323
public class Calculator {
	
	//true이면 켜짐, false는 꺼짐 
	boolean powerOn; //필드생성
	
	/**
	 * 전원을 키거나 끕니다.	
	 */
	public void powerOn() {  //메소드
		if(powerOn) {
		powerOn = false;
		System.out.println("turn off");	
	}  else {
		powerOn = true;
		System.out.println("turn on");
	}
	}	
	public int add(int num1, int num2) {
		if(powerOn) {
			return num1 + num2;
		}else {
			System.out.println("계산기를 실행해주세요");
			return 0;
		}
	}
	public int add(int[]numbers) {
		int sum =0;
		for(int num :numbers) {
			sum += num;
		}
		return sum;
	}
	
	//배열타입으로 선언(매개변수 개수 모를 경우)
	public int addFn(int...numbers) {
		int sum =0;
		for(int num : numbers) {
			sum +=num;
		}
		return sum;
	}

}

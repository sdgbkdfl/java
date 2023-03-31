package sec02.exam03;

public class Tire {
	//필드
	public int maxRotation;//최대회전수
	public int rotation; //누적회전수
	public String location;//타이어의 위치
	

	
	public Tire(String location, int maxRotation
			){
		//생성자 -> 필드를 초기화
		this.location = location;
		this.maxRotation = maxRotation;
	
}
	/**
	 * 타이어 1회전 
	 * 1번 실행시 마다 누적 회전수 증거
	 * 만약 maxRotation보다 크면 false 를 리턴
	 * @return
	 */
	
	public boolean roll() {
		rotation++; //타이어 1회전
		System.out.println(location+" " + "누적회전수:"+rotation);
		System.out.println(location+" " + "최대회전수:"+maxRotation);
		
		if(rotation >= maxRotation) {
			//바퀴교체 알림
			return false;
		}
		return true;
	}
}

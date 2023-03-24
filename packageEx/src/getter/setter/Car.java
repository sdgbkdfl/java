package getter.setter;
//230324
//getter, setter 연습

public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		//필드값 반환
		return speed;
	}
	public void setSpeed(int speed) {
		//필드의 값을 변경
		//검증 후 값을 변경합니다
		if(speed>0) {
			this.speed = speed;
		}else {
			this.speed =0;
		}
	}
		//is로 시작될 경우 반환타입은 boolean인 경우 다수
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		if(stop) {
			this.setSpeed(0);
		}
		this.stop = stop;
	}
	
}

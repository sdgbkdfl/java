package sec01.exam01;


//여러개의 인터페이스를 구현 가능
//인터페이스들에 선언된 추상 메소드 모두 구현해야함
//미구현 메소드 남아있으며 추상 클래스됨
public class Audio implements RemoteControl{

	private int volume;
	
	@Override
	public void turnOn() {	
		System.out.println("오디오를 켭니다");
	}

	@Override
	public void turnOff() {		
		System.out.println("오디오를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		
		//인터페이스의 상수값을 이용해서 볼륨 필드의 값 제한
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
			
		}
	System.out.println("현재 오디오 볼륨 : "+ this.volume);
		
	}


		
	}



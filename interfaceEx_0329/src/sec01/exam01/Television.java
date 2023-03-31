package sec01.exam01;

public class Television implements RemoteControl {

	//필드
	protected int volume;

	
	//turnOn()추상 메서드의 실체 메서드
	@Override
	public void turnOn() {
		System.out.println("Television turn on");
	}
	
	//turnOff() 추상메소드의 실체 메소드	
	@Override
	public void turnOff() {
		System.out.println("Television turn off");
	}
	
	//setVolume()추상 메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;			
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨 : "+this.volume);
	}

}

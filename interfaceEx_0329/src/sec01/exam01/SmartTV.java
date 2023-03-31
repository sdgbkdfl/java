package sec01.exam01;

public class SmartTV implements RemoteControl,Searchable  {
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("스마트 티비를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("스마트 티비를 끕니다.");
		
	}
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
			
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+this.volume);
		
}	//searchable의 추상메서드에 대한 실체 메서드
	public void seach(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		
	}

		
	
}
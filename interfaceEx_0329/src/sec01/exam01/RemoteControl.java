package sec01.exam01;

//인터페이스 선언
public interface RemoteControl {
	//생성자 가질 수 없음
	//인스턴스 필드 가질 수 없음 -> 상수 사용가능
	
	//static final을 자동으로 붙여줌
	//상수 : 대문자로 작성하고 문자가 연결될 경우 언더바(_)이용
	//상수 필드 선언
	//[public static final] 타입 상수이름 = 값;
	public int MAX_VOLUME =10;
	public int MIN_VOLUME =0;
	
	
	//추상메서드
	//리턴타입 메소드이름(매개변수,...);
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}

package getter.setter;

public class SingletonEx {
	
	//나의 타입으로 필드를 선언
	private static SingletonEx singleton = new SingletonEx();
	
	//1. private 접근제한자를 사용하여 생성자를 이용하지 못하도록 차단
	private SingletonEx() {
	
}
	//2. 외부에서 접근할 수 있는 메서드를 만들고 생성된 객체 반환
	// -생성 할 수 없으므로 정적 메서드로 만들어야 한다
	// -정적 필드에 자신을 생성하여 리턴해줌
	public static SingletonEx getInstance() {
		//정적 메서드에서는 정적필드 , 정적 메서드만 사용이 가능하다.
		//static 입력안했더니 메인에서 오류뜸
		return singleton;
	}
}

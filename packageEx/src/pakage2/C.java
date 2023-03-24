package pakage2;


public class C {
	
	//외부에서 생성자 접근 제한
	public C() {
		
	}
	
	private C(int i) {
		this();
	}
	
	public void method1() {
		System.out.println("method1");
		method2();
		//public은 패키지 달라도 사용가능
	}
	private void method2() {
		System.out.println("method2");		
	//메소드2는 접근제한자가 프라이빗이라 패키지가 다른 A패키지에서 호출 불가함 

	}
}

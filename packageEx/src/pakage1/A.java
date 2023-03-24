package pakage1;

import pakage2.C;

public class A {
//접근제한자는 하나의 클래스에 하나만 입력가능
	
	//필드 정의
	C c = new C();
	//package2에 클래스 C에 접근제한자가  public이라 가져다 쓸수 있음 
	//코드 작성 불가
	//접근제한자 입력안해주면 defalut(다른패키지에서 사용불가)로 적용됨
	//필드없이 사용도 가능 (메소드 안에 작성하여)
	
	//기능정의
	public void name() {
		c.method1();
		B b = new B();
 //		c.method2(); 
		//메소드2는 프라이빗(메소드 내에서만 사용가능)이라 패키지 다르면 호출안됨 
	}
	
}
class B{
	//접근제한자가 default의 경우 같은 패키지에서 호출가능
	 B(){
		 
	 }
}
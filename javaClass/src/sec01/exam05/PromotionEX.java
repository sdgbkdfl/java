package sec01.exam05;
//p334 자동타입변환
class A{}

class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class PromotionEX {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; //자동 형변환
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
}
}

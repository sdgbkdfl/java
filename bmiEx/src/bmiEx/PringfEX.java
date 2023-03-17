package bmiEx;

public class PringfEX {

	public static void main(String[] args) {
	String name = "곽두팔";
	int age =58;
	String id ="java";
	double height =1.6;
	
	int money = 10000000;
	System.out.printf("%,d\n", money);
	
	//이전에 하던 방식 System.out.println("이름:"+name+ "나이:"+age+ "아이디: "+id);
	
	//형식 문자열=>연결할 내용 많을때
	//지정한 형식문자열에 맞게 값 또는 변수를 대입할 수 있다
	//%s -문자열, %d - 정수 %f- 실수
	//자릿수 정해줄 때 왼쪽 빈자리 공백:%5d 오른쪽빈자리:%-5d 빈자리 0으로:%05d
	
	//연습
		System.out.printf("이름: %s 나이:%d 아이디:%s 키:%f", name, age, id, height);
		
	
		System.out.printf("\n이름: %5s 나이:%07d 아이디:%s 키:%-10.2f", name, age, id, height);
		
		System.out.printf("\n이름: %6s 나이:%06d 아이디:%6s 키:%010.2f", name, age, id, height);

		System.out.printf("\n이름: %6s, 나이:%d, 아이디:%s, 키:%f", "홍길동", 33, "gildong", 1.3);
		
		

	}

}

package scanner;

import java.io.IOException;

public class KeycodeEx {

	public static void main(String[] args) throws IOException  {
		//System.in.read()메서드는 오류가 발생 할 수 있다
		//오류를 처리하는 두가지 방법중 throws 하는 방법을 선택하여 해결
		//다른 방법은 try{} catch(){}문으로 감싸서 해결
		
		int code1 = System.in.read();
		int code2 = System.in.read();
		int code3 = System.in.read();
		int code4 = System.in.read();
		int code5 = System.in.read();

		System.out.println("==키코드 출력==");
		//사용자의 입력 대기
		//엔터를 입력하는 순간 실행
		System.out.println((char)code1);
		System.out.println(code2);
		System.out.println(code3);
		System.out.println(code4);
		System.out.println(code5);
		
	}

}

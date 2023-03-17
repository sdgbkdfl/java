package scanner;

import java.io.IOException;

public class WhileEx {

	/**
	 * 키보드로부터 입력되 키코드를 출력
	 * @param args
	 * */
	
	public static void main(String[] args) throws IOException {
		
		//while(){} : 반복문
		//()값이 참이면 코드블럭을 무한대로 생성
		
		System.out.println("키보드 입력을 기다리는 중입니다");
		
		// 반복 ()안의 조건이 true이면 계속해서 코드블럭을 실행
		while(true) {
			//사용자의 입력을 대기
			int input = System.in.read();
			//1. System.out.println((char)input);
			//Q,q가 입력되면 반복 종료
			//|| : 이거나 또는
			//input 변수의 값이 81이거나 113이면 코드블럭을 실행
			if(input == 81||input==113) {
				//반복문을 탈출(내가 속해있는 반복 코드블럭을 탈출)
				break;
		//Q값을 출력하지는 않고 종료하고자 하면?
		//System.out.println("keycode :"+input) 위치변경
				
				
			//if(true){}
			//*break문이 속해있는 반복문을 탈출
			//break;
			
			}
			System.out.println("keycode :"+input);
			
	}
		System.out.println("종료합니다.");
}
}
			

	



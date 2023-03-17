package scanner;

import java.io.IOException;
import java.util.Scanner;

public class WhileTe {

	public static void main(String[] args) throws IOException {
		System.out.println("키보드 입력을 기다리는 중입니다");
		while(true) {
			int input = System.in.read();
			if(input == 81||input==113) {
				break;
				
			}
			System.out.println("keycode :"+input);
			/* 
			 * 출력 
			키보드 입력을 기다리는 중입니다
			123
			keycode :49
			keycode :50
			keycode :51
			keycode :13
			keycode :10
			 */
			
			//왜 다섯개 값 나온건지???
		
			
		}
		System.out.println("종료합니다.");
	}
	}



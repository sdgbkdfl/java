package scanner;

import java.util.Scanner;

public class BmiInt {

	public static void main(String[] args) {
		
        //nextInt사용해서 Bmi 출력하기=> double 사용
		
		//변수선언
		Scanner scan = new Scanner(System.in);
		while(true) {
			//정수형-> 실수형 변환
			
			//키(h)입력
			System.out.println("키를 입력(단위:m) : ");
			double h = scan.nextDouble();
			
			//몸무게(w) 입력
			System.out.println("몸무게를 입력(단위:kg) : ");
			double w = scan.nextDouble();
			System.out.println();
			
			//Bmi(b) 출력
			double bmi = w /(h*h);
			System.out.printf("당신의 bmi는 %2f 입니다", bmi);
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			/*Bmi가 18.5이하면 저체중
			 * 18.5~22.9 사이면 정상
			 * 23.0~24.9 사이면 과체중
			 * 25.0이상부터는 비만
			 */
			
			if(bmi <=18.5) {
				System.out.println("저체중 입니다");
			} else if(bmi <=22.9) {
				System.out.println("정상 입니다");
			
			} else if(bmi <=24.9) {
				System.out.println("과체중 입니다");
		}     else {
			    System.out.println("비만 입니다.");
		}
		
		
	
		
	}

	}
}

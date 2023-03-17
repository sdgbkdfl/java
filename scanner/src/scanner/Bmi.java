package scanner;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키 입력해주세요:");
		//변수이름. : 사용가능한 메서드 목록 제시
		String height = scan.next();
		 //next,nextline, scanInt =>사용자의 입력 대기
		System.out.printf("당신의 키 %s입니다", height);
		
		//몸무게 입력해주세요
		//몸무게 입력받고 출력
		System.out.println("\n몸무게 입력해주세요:");
		String weight = scan.next();
		System.out.printf("당신의 몸무게 %s입니다", weight);
		scan.close();
		//scanner가 사용하고 있던 리소스 반납 ...?왜 반납?
		//scan.next(); =>콘솔창에 입력대기
		
		
		//연산하기 위해서 숫자로 불러와야함(형변환)
		//BMI공식 = 몸무게 /키*키
		Double dheight = Double.parseDouble(height);
		Double dweight = Double.parseDouble(weight);
				System.out.println();
	System.out.printf("당신의 Bmi는 %.2f 입니다", dweight/(dheight*dheight));
		

		
	
	}

}

package bmi;

import java.util.Scanner;

public class BmiEx {

	int j =0; //필드, 전역변수 (지역변수와의 차이점)
	
	public static void main(String[] args) {
 /*
  * 접근제한자	class 클래스이름{
  * - 필드 : 속성 정의, 마치 변수 같음
  * - 메서드 : 기능을 정의(동적)
  *     mainMethod : 프로그램 실행 담당
  * - 생성자 : 객체 생성 시 사용
  *     new를 만나면 생성자를 통해 객체 생성  
  */
//Ex   int i =  0; // 지역변수
//======삼항연산자를 사용한 BMI 구하기======
		//변수 선언
		//타입 변수명 = new 타입(매개변수);
		//기본 변수: 메모리에 값 가지고 잇음
		//참조 변수: 메모리 주소값 가지고 있음
		Scanner scanner = new Scanner(System.in);
		
		while(true){			
			System.out.println("BMI 계산");
			System.out.println("키를 입력해주세요(m) 숫자만 입력 가능:");
			double height = scanner.nextDouble();
			
			System.out.println("몸무게를 입력해주세요(kg) 숫자만 입력 가능:");
			double weight = scanner.nextDouble();
			
			double bmi = weight / (height*height);
			System.out.printf("당신의 Bmi는 %.2f 입니다.\n", bmi);
			
			//삼항연산자
			//변수 = (조건)? 참:거짓;
			String bmiRes = (bmi<=18.5)?"저체중"
					:(bmi <= 22.9)?"정상"
							:(bmi<= 24.9)?"과체중":"비만";
			System.out.println(bmiRes + " 입니다.");
			
			System.out.println("계속하시겠습니까? y:n ");
			String exit = scanner.next();
			if(exit.equals("n")) {
				break;
				
			}
		}
	    scanner.close();
		System.out.println("-종료-");
	}

}

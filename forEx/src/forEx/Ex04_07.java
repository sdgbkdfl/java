package forEx;

import java.util.Scanner;

public class Ex04_07 {

	public static void main(String[] args) {
		//while문
		//scanner
		//switch
		// 사용자가 키보드로 데이터를 입력할 수 있게 하는 객체를 생성
	 Scanner scan =new Scanner(System.in); 
	 
	 int money =0; //반복문 밖에 작성! 금액 저장하는 변수
	 
	 outter:
	 while(true) {		
		System.out.println("--------------------------");
		System.out.println("1. 예금| 2. 출금| 3. 잔고| 4. 종료");
		System.out.println("--------------------------");
		System.out.println("Select>");
		
		//scan.next()//사용자의 입력을 문자열로 반환
		int input = scan.nextInt();//사용자의 입력을 숫자로 반환
		//switch (변수){
		//case  변수의 값:
		//}
		switch(input) {
		case 1: 
			//변수의 값이 1이면 실행
			//코드 작성
			System.out.println("예금액> ");
		//	money +=Integer.parseInt(scan.nextInt());
			money +=scan.nextInt();  //뭔 역할?
			System.out.println("예금액" + money);
			//break문이 없으면 다음 case를 계속 실행
			break;
			
		case 2:
			System.out.println("출금액>");
			System.out.println("==출금:"+money);
			int num = scan.nextInt();
			if(money<num) { //num은 출금하고자 하는 금액
				System.out.println("금액이 부족합니다");
			}else{
				money -=num; //money = money - num
			}
			break;
			
		case 3:
			System.out.println("잔고>");
			System.out.println("잔고:" + money);
			break;
						
		case 4: 
			//System.exit(0)
			System.out.println("종료");
			break;
			
		default:
			break;
					
	}
	    //자원 반납
		scan.close();
		System.out.println("--------프로그램 종료--------");
	 }
	}

}

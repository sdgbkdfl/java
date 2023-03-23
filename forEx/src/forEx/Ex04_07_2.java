package forEx;

import java.util.Scanner;

public class Ex04_07_2 {

	public static void main(String[] args) {
		
		//키보드 입력 개체 생성(Scanner)
		
		//while(반복문)과 switch(조건문)를 사용한 예금 인출 코드 작성

		boolean run = true;

	        int balance = 0;

	        while (run) {
	            Scanner scanner = new Scanner(System.in);
	            System.out.println("----------------------------------");
	            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
	            System.out.println("----------------------------------");
	            System.out.println("선택> ");

	            int inputNum = scanner.nextInt();
	            switch (inputNum) {
	                case 1:
	                    System.out.println("예금액> ");
	                    int deposit = scanner.nextInt();
	                    balance += deposit;
	                    break;
	                case 2:
	                    System.out.println("출금액> ");
	                    int withdraw = scanner.nextInt();
	                    if (balance - withdraw < 0) {
	                        System.out.println("잔액이 부족해 출금할 수 없습니다.");
	                    } else {
	                        balance -= withdraw;
	                    }
	                    break;
	                case 3:
	                    System.out.println("잔고> " + balance);
	                    break;
	                case 4:
	                    System.out.println("프로그램 종료");
	                    run = false;
	                    break;
	            }
	        }
		
	}

}

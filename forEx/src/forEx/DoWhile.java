package forEx;

public class DoWhile {

	public static void main(String[] args) {
		//do whlie문 
		//while문은 조건이 참일 경우만 실행하였으나 
		//do while문은 일단 실행하고 참 거짓 판별
		//차이점
		
		int i= 10;
		while(i<0) {
			System.out.println("0보다 작습니다");
		}
		
	    do {
	    	System.out.println("do-while문은 코드블럭을 무조건 1회 실시합니다.");
	    	System.out.println("1실행 후 조건문이 참일때까지 반복합니다.");
	    } while (i>0);
		}
	}
	



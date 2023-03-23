package forEx;

public class Ex04_02 {

	public static void main(String[] args) {
		// 확인문제
		// for(초기화;조건;증감){}
		// sum = 3+(3*2)+(3*3)....
		// sum < 100
		
//		int sum = 0;
//		for(int n=1;n<=33;n++) {
//			System.out.printf("");
//==========================================================			
			
			
			int sum = 0;
			for(int i=1;i<101;i++) {
				//3의배수인지 판단
				//!= :아니면(부정연산자)
			if(i%3!=0) {
				//3의 배수가 아니면 증감식으로 이동
				//break: 반복문 탈출
				//continue:증감식으로 이동
				//continue 이후 명령문장을 실행하지않고 증감식으로 이동
				continue;	
				}
			//3의 배수만 넘어올 수 있다
			sum += i;
			
			System.out.println("i="+i);
			}//for문 종료
			System.out.println("합계:"+sum);
		}
			

	}


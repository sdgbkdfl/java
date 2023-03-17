package ifelse;

public class Random {

	public static void main(String[] args) {
//주사위
		double num = Math.random();
		//0.5445677765
		int numRes = (int)((num*6+1));
		System.out.println("주사위 : "+numRes);
 		
		
//Switch 제어문
//TODO		int numRes = (int) (Math.random()*6) + 1;
				
		switch(numRes) {
		case 1 :
			System.out.println("1번");
			break;
		
		case 2 :
			System.out.println("2번");
		
		 
		case 3 :
			System.out.println("3번");
		
		 
		case 4 :
			System.out.println("4번");
		
		 
		case 5 :
			System.out.println("5번");
		
		
		case 6 :
			System.out.println("6번");
			
		default:
			System.out.println("======종료======");
			break;
		
		}
		
		
		
		
//Math.random()
		//0.0~1.0 사이의 무작위 수를 추출하여 double 타입으로 변환
		//0.0000000...1 ~ 0.999999...9
		//10곱했을때 : 0-9 -> 1-10
		//100 곱했을때 : 00-99
		
		
		double rotto1 = Math.random();
		double rotto2 = Math.random();
		double rotto3 = Math.random();
		double rotto4 = Math.random();
		double rotto5 = Math.random();
		
		
		System.out.println(rotto1);
		System.out.println(rotto2);
		System.out.println(rotto3);
		System.out.println(rotto4);
		System.out.println(rotto5);
		System.out.println("=======================");
//=========================================
//책 문제 연습
		int numm = (int) (Math.random()*6) + 1;
		
		if(numm==1) {
			System.out.println("1번 입니다.");
		} else if(numm==2) {
			System.out.println("2번 입니다.");
		} else if(numm==3) {
			System.out.println("3번 입니다.");
		} else if(numm==4) {
			System.out.println("4번 입니다.");
		} else if(numm==5) {
			System.out.println("5번 입니다."); 
			
		} else {
			System.out.println("6번 입니다.");
			
		}

	}

}

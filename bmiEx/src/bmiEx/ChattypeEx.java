package bmiEx;

public class ChattypeEx {

	public static void main(String[] args) {
		
		//문자리터럴 - 작은따옴표
		//홑따옴표 안에 하나의 문자를 저장
		char var1 = 'A';
		char var2 = '맹';
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println("====char타입 숫자====");
		
		char var3 = 65;
		char var4 = 0x0041;
		
		// 타입변환 -> 변수 앞 괄호 안에 타입 삽입
		
		System.out.println((int)var3);
		System.out.println(var4);
		
		System.out.println("나는\n오늘\n \'순대국\'");
		
		//정수에 리터럴이 입력되면 int 로 받아들이기 때문에
		//long 타입의 경우 숫자뒤에 l또는L을 입력해줌
		long var6 = 123456789l;
		 System.out.println(var6);
		
		//실수타입
		//실수에 리터럴이 입력되면 double 타입으로 받아들이기 때문에
		// F붙여줌
		float var7 = 0.123456789f;
		double var8 = 0.123456789;
	    float var9 = 5e3f;
	    
	    boolean var10 = true;
	    boolean var11 = false;
	    //트루 문자열과는 다름
	    System.out.println("출력확인");
	 
	    if(true) {
	    	System.out.println("true");
	    }
	    if(false) {
	    	System.out.println("true");
	    } else {
	    	System.out.println(false);
	    }
			
					System.out.println("====실수 출력====");
					System.out.println(var7);
					System.out.println(var8);
					System.out.println(var9);
	}
	
}



package bmiEx;

public class Literal {

	public static void main(String[] args) {
		
        int i = 0b1011; // 0b로 시적하면 2진수
        int j = 013;    // 0으로 시작하면 8진수
        int k = 0xB3;   // 0x로 시작하면 16진수
        
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        
        //리터럴은 값 그 자체 의미함, 
        // 값이 입력되면 정수는 int
        //실수는 double
        //형변환
        byte var1 = 127;
        byte var2 = -128;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = -30;
        
        //바이트 값의 허용범위 -128~127
        //허용범위 벗어나면 오류 발생
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        
        
        
        
	}

}

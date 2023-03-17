package bmiEx;

public class operater {

	public static void main(String[] args) {
		byte byteValue = 10;
		byte byteValue1 = 20;
		
		//byte, short,char타입(정수타입, long빼고)은 연산시에
		//int타입으로 변환 되어서 연산==>그 결과 int 타입이 반환
		//byte byteValue2 = byteValue + byteValue1;
		
		//바이트 타입으로 결과도출하려면
		byte byteValue2 = (byte)(byteValue + byteValue1);
		//바이트 연산 결과를 바이트로 묶은 것
		
		System.out.println("==형변환 연습==");	
		System.out.println(byteValue2);
		
		//but 특별한 경우 아니라면 정수 연산에 사용하는 변수는 
		//int 타입으로 선언하는 것이 효과적
		int intValue2 = byteValue + byteValue1;
		System.out.println(intValue2);
		
		System.out.println("==실수의 연산==");
		//=========실수의 연산 ==========
		//변수의 이름 같을 수 없다
		int iValue =10;
		double dValue =5.5;
		double result = iValue + dValue;
		
		System.out.println(result);
		System.out.println((double)iValue);//=> 10.0
		System.out.println(5/2); //=> int(정수)라서 2 나옴 
		System.out.println((double)5/2); 
		System.out.println(5/(double)2); //5/2.0
		System.out.println((double)(5/2)); //=>2.0
		
		
		//=====문자열을 기본타입으로 강제 타입변환하는 방법
		//.parseInt(str)
		
		String str = "10";
		
		//int 타입으로 형변환(str->int)
		//parseInt(string s) : int
		//string 타입의 매개변수을 넣고 실행결과 타입을 반환받는다
		int i = Integer.parseInt(str);
	
		System.out.println("==문자열을 기본타입으로 강제 타입변환==");
		System.out.println(i);
		
		byte value = Byte.parseByte(str);
		short value2 = Short.parseShort(str);
		//문자열을 숫자로 변경하는 메소드
		long value3 = Long.parseLong(str);
		float value4 = Float.parseFloat(str);
		double value5 = Double.parseDouble(str);	
		
		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		str = "12.345";
		double d = Double.parseDouble(str);
		System.out.println(d);
		
		str = "true";
		boolean b = Boolean.parseBoolean(str);
		System.out.println(b);
				
		//string.valueOf()메소드 사용하여 기본타입을 문자열로 변환
		//string strValue = String.valueOf(123);
		
		String.valueOf(123.11);
		String.valueOf('가');
		String.valueOf(true);
		
		System.out.println(String.valueOf(123.11));
		
		//자바는 실수 리터럴을 기본적으로 double타입으로 해석.
		long var1 =2l;
		float var2 = 1.8f; //=>실수연산
		double var3 = 2.5; //=>실수연산
		String var4 = "3.9"; //실수로 변환(double)
			
		int result1 = (int)(var1+var2+var3+(int)Double.parseDouble(var4));
		// 2+1.8+2.5+3=9.3 => int 9 이해완.
		
	    System.out.println(result1);
	}

}

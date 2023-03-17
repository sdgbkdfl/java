//패키지 선언
package bmiEx;

//클래스 선언
//접근제한자 class 클래스명
public class Bmi {
     //클래스 바로 아래 작성되는 변수 -> 필드 : 속성 정의
	
	//메인메소드 실행
    //접근제한자 리턴타입 메소드명 (매개변수의타입 매개변수명)
	// void 리턴 타입이 없는 경우
	
	/* 변수의 사용범위 :
	 * 시작블록{이후 선언된 변수는 종료 블럭을 만나면 사라진다}
	//메서드블록 내부에 선얹된 변수는 
	//블럭 내부에서만 사용 가능
	// 다른 명령 문장에서 블럭이 열리면 마찬가지로
	블룍 내부애서만 사용 가능
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int 정수, double 실수 
		//키 1.6 몸무게 50
		double bmi = 50/(1.6*1.6);
		
        System.out.println("당신의 Bmi는 ..." + bmi);
        System.out.println();
        
        int value = 0; 
        //int value; 변수선언
        

       
        //value = 10; value를 10으로 초기화
        
        //sum = value; SUM 에 VALUE 값과 20더함
        
        
        
        
        //만약 ()안의 조건이 참이라면 {}코드블럭을 실행
        // if(조건문) {}

        if(1<0) {
        	System.out.println("1<0");
        }
        
        if(true) {
        	System.out.println(true);
        	System.out.println("true");
        	
        }
        
        if(false) {
        	System.out.println(false);
        	System.out.println("false");
        }
        
        
        
        
        
        
        
	}

}

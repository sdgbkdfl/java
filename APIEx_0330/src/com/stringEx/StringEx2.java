package com.stringEx;

public class StringEx2 {

	public static void main(String[] args) {
		String str = "자바프로그래밍";
		//매개값의 문자열을 포함하고 있으면
		//포함 : 시작 인덱스 값을 반환
		//불포함 : -1 반환
		System.out.println(str.indexOf("프로"));
		System.out.println(str.indexOf("C"));
		System.out.println(str.substring(str.indexOf("프로")));
		
		if(str.indexOf("자바")>0) {
			System.out.println("자바관현있음");
			
		}else {
			System.out.println("자바와 관련없음");
			
		}
		
		// 문자의 길이를 반환
		//id의 길이는 5자 이상이어야 함
		String id = " id";
		if(id.length()<5) {
			System.out.println("아이디는 5자 이상 14자 이하 작성 가능");
		}
		String ssn = "123456789145";
		
				
		if(ssn.length()!=13) {
			System.out.println("주민번호를 정확히 입력하시오");
		}
		
		//원하는 문자열을 추출
		//시작인덱스 포함. 끝인덱스 불포함
		System.out.println("주민등록 앞자리 :"+ssn.substring(0, 6));
		System.out.println("주민등록 뒷자리 :"+ssn.substring(6));
		
		
		//문자 교체
		str = "자바는 객체지향 언어입니다. 자바를 자바봅시다";
		System.out.println(str.replace("자바","Java"));
		
		//다른 출력방법( 변수에 넣은 후 출력) 
		String A = str.replace("자바","Java");
		System.out.println(A);
		
		
		
		//대소문자 교체
		str = " Java Programe Language";
		
		//대문자로 변경
		System.out.println("대문자로 변경:"+str.toUpperCase());

		//소문자로 변경
		System.out.println("소문자로 변경"+str.toLowerCase());
		
		str = "q";
		//대소문자를 구분하지 않고 비교
		System.out.println(str.equalsIgnoreCase("Q"));
		System.out.println(str.equalsIgnoreCase("q"));
		
		
		//공백 제거헤주는 메소드
		id = "     id";
		System.out.println(id); //제거 안한 상태
		System.out.println(id.trim()); //제거 완
		
		
		//기본타입을 문자로 변경
		System.out.println(String.valueOf(10));	
		System.out.println(String.valueOf(10.5));
		System.out.println(String.valueOf(true));
		
		
	

		
	}

}

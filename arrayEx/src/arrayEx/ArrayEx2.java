package arrayEx;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 값목록으로 배열 생성
		// 뭘 하고자 했을까....
		// String 타입 
		int[] score = {90, 5, 10}; //배열 생성
  
		String[] str = {"차은우", "박보검", "서강준"};
		System.out.println(str[0]);
		// 반복문 이용해서 배열에 입력된 값 출력
		// 변수명.length :배열의 값의 갯수		
		// 초기화;조건식;증감식
		
		for(int i=0; i < str.length; i++) {
			//배열의 값에 접근 : 변수이름[방번호]
			System.out.println(str[i]);						
		}
		System.out.println(score);
		System.out.println(score.hashCode());
		System.out.println(Integer.toHexString(score.hashCode()));
	}

}

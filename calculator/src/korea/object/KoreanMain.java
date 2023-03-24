package korea.object;

public class KoreanMain {

	public static void main(String[] args) {
		Korean korean =new Korean();
		//객체를 초기화 시켜주는 생성자를 호출
		//초기화가 안된상태-> 외부에서 초기화 가능
		korean.ssn = "111111-111111";
		System.out.println(korean.ssn);
		
		
		//값을 받아서 객체 초기화
		Korean hong = new Korean("홍길동","123456-7899100");
		
		
		//객체 생성 -타입 변수명 작성
		
		

	}

}

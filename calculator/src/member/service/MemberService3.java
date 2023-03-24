package member.service;

public class MemberService3 {
	//필드
	public String id;
	public String pw;
	
	/**
	 * 로그인 처리
	 * 필드에 등록된 id와 pw가 일치하면 true
	 * 일치하지 않으면 false 반환
	 * @param id
	 * @param pw
	 * @return 로그인 성공 : true, 로그인 실패 : false
	 */
	
	//생성자 : 필드를 초기화
	public MemberService3(String id, String pw) {
		this.id = id;
		//   필드  매개변수
		this.pw = pw;
		//this를 왜 사용하는지 생각하기!-> 중복 코드 개선 (X)
		//생성자가 많지도 않은데? => 필드와 매개변수 이름이 동일하기 때문에 
		//(동일한 이름의 매개변수가 사용 우선순위가 높으므로)
		// 필드 앞에 this를 붙이고 참조변수로 필드 사용
	}
	
	//두개의 메소드
	//필드에 등록된 아이디와 패스워드가 일치하면 트류
	//일치하지 않으면 false를 반환
	//사용자로부터 아이디와 패스워드를 불러옴()
	public boolean login(String id, String pw) {  //메소드, 역할:논리연산 필드값일때 참?  
	//접근제한자 타입 변수명(필드값
	
	//필드 id :this.id (this로 나의 필드 값에 접근)	
	//괄호값이 참이면 로그인 성공 (리턴값 참으로 반환, 아니면 false)
	if(id!=null && id.equals(this.id)&& pw!=null && pw.equals(this.pw)) {
		System.out.println("로그인 성공");
		return true;
	}else {
		
		return false;
	}
	
}
	
	public void logout() {
		System.out.println(id +"님 로그아웃 되었습니다");
	//public void logout()-이 메소드 괄호안에 String id가 있었다면 
	//지역변수를 우선하기 때문에 필드값 못 끌어와서 다시 작성해줘야함
	//괄호가 비었으니까 필드값 끌어와서 출력 가능
	//동일한 이름의 지역변수가 없으니까 id 는 필드를 의미
		//지역변수 있었다면 지역변수가 우선적임
		
		
}
}


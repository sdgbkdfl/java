package member.service;

//필드값 작성해주고 필드에 등록된 아이디와 패스워드가 일치하면 트류

public class MemberService2 {
	//필드 -객체의 데이터 저장
	public String id;
	public String password;
	
	
	//생성자 -new연산자로 호출되는 중괄호{}블록, 객체 생성시 초기화
	public MemberService2(String id,String password) {
	this.id = id;
	this.password = password;
	}

	//로그인 메소드
	public boolean login(String id,String password) {
		if(id!=null && id.equals(this.id)&& password!=null && password.equals(this.password)) {
		System.out.println("로그인 성공");
		return true;
	}else 
		return false;
	}

	public void logout() {
		System.out.println("로그인 정보가 일치하지 않습니다.");
	}

}
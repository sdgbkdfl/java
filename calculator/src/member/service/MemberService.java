package member.service;

public class MemberService {
//MemberService클래스에 login()메소드와 logout()메소드를 선언
	

	//접근제한자 반환타입 메소드명 (매개변수타입, 매개변수명)
	public boolean login(String id, String password) {
	
	//id에 null이 입력될 경우,nullpointexception이 발생할 우려가 있다
	//null이 아닌 경우 체크로직을 실행하거나 "hong"(문자열).equals를 사용		
		if(id!= null&&"hong".equals(id)
				&&"12345".equals(password)) {		
			//&&는 앞문자에 참일 경우에만 다음 식으로 넘어감
			return true;
		}
			return false;
	}
	
	public void logout(String id) {
		System.out.println("로그아웃되었습니다.");
		
	}
	
}

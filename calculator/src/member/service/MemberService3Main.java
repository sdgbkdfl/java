package member.service;

public class MemberService3Main {

	public static void main(String[] args) {
		 MemberService3 member   = new  MemberService3("홍길동", "1234");
		 
		 boolean res = member.login("홍길동", "1234");
		 
		 if(res) {
			 System.out.println("환영합니다.");		 
			 
		 }else {
			 System.out.println("로그인 정보가 일치하지 않습니다.");
		 }
	}


	}
	
//------------------------------------------------------------------------------




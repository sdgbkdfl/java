package member.service;

public class MemberServiceMain {

	public static void main(String[] args) {
		//메소드 호출
		MemberService service = new MemberService();
		//다른 방법
		//boolean res =service.login("hong","12345");
		//if(res){ System.out.println("로그인 되었습니다");}
		//else {System.out.println("아이디와 비밀번호가 일치하지 않습니다");
		
		if(service.login("hong", "12345")) {
			System.out.println("로그인 되었습니다");
		}else {
			System.out.println("아이디와 비밀번호가 일치하지 않습니다");
			
		}
		service.logout("hong");

	}

}

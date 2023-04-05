package member.service;

public class MemberService2Main {

	public static void main(String[] args) {
		
		
		MemberService2 service = new MemberService2("홍길동","123");
		
		boolean res = service.login("홍길동","123");
		
			if(res) {
				System.out.println("로그인이 완료되었습니다");
				
			}else {
				System.out.println("로그인정보가 일치하지 않습니다");
			}
		}
		
		
		
		
		
		
		
		
}


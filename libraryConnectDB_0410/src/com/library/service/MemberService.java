package com.library.service;

import com.library.dao.MemberDao;
import com.library.vo.MemberVo;

public class MemberService {
	MemberDao memberDao = new MemberDao(); 
	
	/**
	 * 로그인 아이디 패스워드를 입력받아
	 * 사용자 조회
	 * 
	 * @param id
	 * @param pw
	 * @return
	 */

	
	public MemberVo login(String id, String pw) {
		MemberVo memberVo = memberDao.login(id, pw);
		
		if(memberVo !=null) {
			System.out.println(memberVo.getName()+"님 환영합니다.");
			return memberVo;
			
		}else {
			System.out.println("아이디/비밀번호가 존재하지 않거나 일치하지 않습니다.");
			return null;
		}
		
	}

	public void insertMember(MemberVo memberVo) {
		
		int res = memberDao.insertMember(memberVo);
		if(res>0) {
			System.out.println("입력됨");
		}else {
			System.out.println("오류발생");
		}		
	}

	
	
	public void deleteMember(String id) {
		//사용자 조회(아이디)
		//사용자 조회할 수 없습니다. 작업 추가 가능
		
		int res = memberDao.deleteMember(id);
		if(res>0) {
			System.out.println("입력됨");
		}else {
			System.out.println("오류발생");
		}
	}

	

	
}

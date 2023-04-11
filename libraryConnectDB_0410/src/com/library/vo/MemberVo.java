package com.library.vo;

public class MemberVo {
	String id;
	String pw;
	String name;
	String adminYN;
	
	
	public MemberVo(String id, String pw, String name, String adminYN) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.adminYN = adminYN;//관리자 계정인지 여부 확인
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId()+" "+
				getName()+" "+ getAdminYN();
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdminYN() {
		return adminYN;
	}

	public void setAdminYN(String adminYN) {
		this.adminYN = adminYN;
	}
	
	
}

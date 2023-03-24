package com.jungang;

public class MemberEx {
	

	//필드선언
	String name;
	String id;
	String password;
	int age;
	
	//생성자
	public MemberEx(String name,String id,String password,int age) {	
			this.name = name;
			this.id = id;
			this.password = password;
			this.age = age;
	}
	
	public MemberEx(String name) {		
			this(name, "아이디", "패스워드", 0);
	}
	
	public MemberEx(String name,String id) {		
		this(name, id, "패스워드", 0);
	}

	}



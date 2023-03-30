package com.objectEx;

public class Member {
	public static void main(String[] args) {
		Member mem1 = new Member("id");
		Member mem2 = new Member("id");
		
		System.out.println("mem1.equal(mem2) :");
		System.out.println(mem1.equals(mem2));
		//equals : 두 객체 비교
		mem1.equals(mem2);
	}
	private String id;
	
	public Member(String id) {
		this.id =id;
		
	}
	@Override
	/**
	 * this(Member객체)가 가지고 잇는 id값과
	 * 매개변수로 박은 object의 id값이 일치하는지 비교
	 */
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			//객체가 가지고 있는 id 값이 같다면 true, 아니면 false;
			if(id.equals(member.id)){
				return true;

	}
	}
		
		return false;
	}
	
	
	
}

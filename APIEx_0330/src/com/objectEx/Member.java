package com.objectEx;

public class Member {
	public static void main(String[] args) {
		Member mem1 = new Member("id");
		System.out.println("******************");
		/**
		 * hashCode()
		 * 객체를 식별하는 하나의 정수 값
		 * Object클래스의 객체 해시코드 메소드는 객체 메모리 번지를 이용하여
		 * 해시코드를 만들어 리턴
		 * ==>>객체마다 다른 값을 가짐
		 * 
		 * 두 객체가 동등한지 비교하는데 사용
		 */
		Object obj = new Object();
		obj.equals(new String("하이"));
		
		System.out.println(mem1.hashCode());		
		//16진수로 변환(Integer라는 객체가 제공)
		String str = Integer.toHexString(mem1.hashCode());
		str.equals(str);
		System.out.println("hashCode() 16진수로 변환"+str);
		
		System.out.println(mem1.toString());
		
		System.out.println("******************");		
		
		Member mem2 = new Member("id");
		
		System.out.println("mem1.equal(mem2) :");
		System.out.println(mem1.equals(mem2));
		//equals : 두 객체 비교
		mem1.equals(mem2);
	}
//-------------------------------------------------------------------------	
	private String id; //필드로 아이디 선언
	
	public Member(String id) {
		this.id =id;
		
	}
	@Override
	/**
	 * this(Member객체)가 가지고 잇는 id값과
	 * 매개변수로 박은 object의 id값이 일치하는지 비교
	 */
	//equals 메소드 재정의
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

package com.objectEx;

public class ObjectEx3 {
	public static void main(String[] args) {
		//키를 멤버라는 객체 이용해서
		Key key1 = new Key(1);
		Key key2 = new Key(1);
		
		System.out.println("key1");
		System.out.println(key1.hashCode());
		System.out.println(Integer.toHexString(key1.hashCode()));
		System.out.println(key1.toString());
		System.out.println("***********************");
		System.out.println("key2");
		System.out.println(key2.hashCode());
		System.out.println(Integer.toHexString(key2.hashCode()));
		System.out.println(key2.toString());
		System.out.println("***********************");
		
		System.out.println("key1.equals(key2)"+key1.equals(key2));
	}
}

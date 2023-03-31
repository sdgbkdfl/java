package com.objectEx;

import java.util.HashMap;

public class ObjectEx2 {
	public static void main(String[] args) {
		/**
		 *         타입   타입
		 * HashMap<Key, value>
		 * HashMap<String, String> hashMap = new HashMap<>();
		 * 
		 * 동일한 키가 저장될 수 없다
		 * 이미 존재하는 키를 이용해 데이터를 담을 경우 덮어쓰기
		 * 
		 * 1  홍길동
		 * 2  김길동
		 * 3  황길동
		 * 
		 * 
		 *  숫자 입력하려면 Integer객체 사용 
		 *  Int는 출력안됨
		 *  
		 */
		
		//선언부 
		HashMap<String, String> hashMap = new HashMap<>();
		
		//데이터 담는 방법
		hashMap.put("키","value");
		hashMap.put("키1","value1");
		hashMap.put("키2","newvalue");
		hashMap.put("key1","홍길동");
		hashMap.put("key2","김길동");
		hashMap.put("key3","황길동");
		
		
		//데이터 꺼내는 방법
		String str = hashMap.get("키");
		System.out.println("키 :" +str);
		
		System.out.println("키1 : "+hashMap.get("키1"));
		System.out.println("키2 : "+hashMap.get("키2"));
		System.out.println("키3 : "+hashMap.get("키3"));
		
		System.out.println("******************************");
		
		System.out.println("key1 : "+hashMap.get("key1"));
		System.out.println("key2 : "+hashMap.get("key2"));
		System.out.println("key3 : "+hashMap.get("key3"));
		
		System.out.println("******************************");
		
		HashMap<Integer, String> hashMap1 = new HashMap<>();
		hashMap1.put(1, "박보검");
		hashMap1.put(2, "서강준");
		hashMap1.put(3, "강동원");
		
		System.out.println(hashMap1.get(1));
		System.out.println(hashMap1.get(2));
		System.out.println(hashMap1.get(3));
		
	}

}

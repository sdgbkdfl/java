package com.arrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		
		List<String>list = new ArrayList<String>();
		
		//리스트에 저장 : add메서드 
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("myBATIS");
		
		list.add(2,"Database"); //추가됨
		
		//삭제
		list.remove(1); // 다음 순서의 객체가 앞으로 당겨져옴
		
		//변경
		list.set(2, "Oracle");
		
		
		//리스트에 저장된 갯수
		int size = list.size();
		System.out.println("총 갯수:"+size);
		
		//리스트에 저장된 객체 얻기
		String str = list.get(2);
		System.out.println("2번 인덱스 : "+str);
		
		//리스트에 저장된 모든 책(객체) 결과 값 출력하기
		for(int i=0;i<list.size();i++) {
			str = list.get(i);
			System.out.println(i+ ":"+ str);
		}
		System.out.println("---------------------------");
		//향상된 for문
		int i = 0;
		for(String s : list) {
			System.out.println(i+":"+s);
			i++;
		}
	}
	
	
}

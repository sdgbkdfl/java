package com.dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		//기본생성자에서 date 객체 생성
		
		Date now = new Date();
		//import하지 않으면 오류 발생
		System.out.println(now.toString());
		//System.out.println(now); ->toString 붙인 값과 같은 값 출력
		
	
		//매개변수 입력해줬을때
		Date when = new Date(1);
		System.out.println(when);
		
		//1/1000s 들어감
		when = new Date(1000);
		System.out.println(when);
		
		System.out.println("getTime :" +now.getTime());
		System.out.println("getYear :" +now.getYear()+1900);
		System.out.println("getMonth :" +now.getMonth()+1);
		System.out.println("getDate :" +now.getDate());
		System.out.println("getDay :" +now.getDay());
		System.out.println("getHours :" +now.getHours());
		System.out.println("getMinutes :" +now.getMinutes());
		
		/**
		 * E:요일
		 * a:am/pm
		 */
		/**
		 * SimpleDateFormat
		 * 원하는 형식으로 날짜를 출력할 수 있도록 도와주는 포맷
		 * 
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 (E) a");
		
		String formatDate =sdf.format(now);
		System.out.println(formatDate);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
				
		
	}

}

package com.systemEx;

public class SystemEx {

	public static void main(String[] args) throws InterruptedException{
		//수행시간 구하기 = 끝난시간-시작시간
		//1/1000초를 구합니다
		Long startTime = System.currentTimeMillis();
		int sum =0;
		for(
		int i=0;i<5;i++){
			sum +=i;
			if(i==4) {
				//JVM강종
			}
			Thread.sleep(1000);
}
		System.out.println("총합계:"+sum);
	
		Long endTime = System.currentTimeMillis();
	
		
		System.out.println((endTime - startTime)/1000+"초 소요되었습니다");
		//1000으로 나눈 이유는 천단위 기준 메소드 사용해서(.currentTimeMillis())
	}

}

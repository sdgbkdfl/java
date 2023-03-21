package arrayEx;

public class ArayyindexOutOfBoundEx {

	public static void main(String[] args) {
		//프로그램 실행 도중 발생하는 오류
		
		//배열 선언한 후 중괄호를 사용해서 값을 입력하면 오류가 발생
		int[] score;
		score = new int []{ 10, 20, 30};
				score = new int [10];
				System.out.println("int타입을 저장할 10개의 공간을 만들옸오요!");

		
		
		
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
			
		}

		

	}

}

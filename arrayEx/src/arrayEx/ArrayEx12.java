package arrayEx;

public class ArrayEx12 {

	public static void main(String[] args) {
		//배열 선언
		//향상된 for문 이용
		//for (타입 변수명 : 배열){}
		int[]  scores = {80, 90, 70, 100};
		int sum =0;
		sum = sum + score;
		double avg = (double)sum/scores.length;		 
		for(int score : scores) {
			System.out.println("점수의 총합 : "+ sum);
			System.out.println("평균 점수: "+ avg);
			
		}
		

	}

}

package arrayEx;

public class ArrayEx13 {

	public static void main(String[] args) {
		//For(타입 변수명 : 배열)
		
		int[]  scores = {80, 90, 70, 100};
		int sum=0;
		for(int score :scores) {
			sum = sum + score;
		}
		double avg = (double)sum/scores.length;
		System.out.println("총합:"+sum);
		System.out.println("평균:"+avg);

	}

}

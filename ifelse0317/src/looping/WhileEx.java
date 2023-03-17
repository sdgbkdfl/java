package looping;

public class WhileEx {

	public static void main(String[] args) {
//1부터 100까지 합을 출력		
		
		int sum = 0; //초기화
		int i = 1; //루프 카운터 변수
		while(i<=100) {
			sum +=i;
			i++;
	 	//i의 값
			
		System.out.println("while문"+i);
		}
		System.out.println("1~" + (i-1)+"합:"+sum);
	}

}

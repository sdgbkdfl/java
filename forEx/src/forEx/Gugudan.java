package forEx;

public class Gugudan {

	public static void main(String[] args) {
		// 이중For문(중첩반복문) 이용
		// 구구단 출력하기
		// for(초기화식;조건식;증감식){}
		// i를 1~9까지 출력
		// %d는 정수
//		int dan = 2;
//		System.out.println(dan+"단");
//		for(int i=1;i<10;i++) {
//        System.out.println("i =" + i );
//        System.out.println(dan +"*"+i+"="+dan*i);
//        System.out.printf("%d*%d=%d\n", dan, i, dan*i);

		// 중첩문
		// i는 2~9
		Outter: for (int dan1 = 2; dan1 < 10; dan1++) {
			System.out.println(dan1 + "단");
			for(int i = 1; i < 10; i++) {
				System.out.printf("%d*%d=%d\n", dan1, i, dan1 * i);
				System.out.println();
				// 6단을 출력한 후 반복문을 탈출
//			if(dan1==6) {
//				break;}
				break Outter;
			}

		}
		// 짝수일 경우의 합
		// 1~10까지의 수중에서 짝수 합
		// continue문
		System.out.println("====짝수의 합 구하기====");
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			// 홀수이면 증감식으로 넘어감
			// %:나머지 연산자
			// 2로 나눈 나머지가 1 이면 홀수, 0이면 짝수
			if (i % 2 == 1) {// 홀수이면
				continue; // 코드실행않고 증감식으로 이동
			}
			System.out.println("i=" + i);
			sum += i;// sum = sum + i

		}
		System.out.println("1~10까지 짝수의 합계:" + sum);
	}
}// main 블럭
//break문이 for문 블럭 밖에 있으면 6단까지 출력되고
//for문 블럭 내에 있다면 6단 빼고 출력됨

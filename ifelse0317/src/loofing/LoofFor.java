package loofing;

public class LoofFor {
public static void main(String[] args) {
	//반복문 - For문
	//for (초기식;조건식;증감식({}
	//초기식 > 조건식 > 코드블럭 > 증감식 > 조건식
	//1~100까지의 합 구하기
	
	int sum = 0;
	for(int i=1;i<=100;i++){
		System.out.println("For문"+i);
//		sum = sum+i;
		sum += i;
	}
	System.out.println("1부터 100까지의 합 :" + sum);
//======================================================
	
	int i=0;
	//i = 0  1 2 3 4 5
	while(i<5){
		System.out.println("while 출력" + i);
		sum += i;
		i++;
	}
	System.out.println("1부터 100까지의 합: " +sum);
	
	
	
 }

}

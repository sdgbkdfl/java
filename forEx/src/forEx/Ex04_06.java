package forEx;

public class Ex04_06 {

	public static void main(String[] args) {
	//역삼각 별찍기
	//수의 범위를 먼저 적어둔다
	//그 다음 공식을 작성
    //어떤 경우는 별 찍고 아니면 공백 입력
		
		for(int i=1;i<5;i++) {  
			for(int j=4;j>0;j--) {
				if(i<j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
	}

}

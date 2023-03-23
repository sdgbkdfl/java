package forEx;

public class Ex04_04 {

	public static void main(String[] args) {
		//별찍기 연습
		
		//2차원 배열 별찍기 3x4
		for(int j =0; j<3;j++) {
			for(int i = 0; i<4; i++) {
			System.out.print("*");
		}
			System.out.println();
		}
		System.out.println("=============");
		
		//삼각형 별찍기	
		for(int m = 1; m<5; m++) { //줄
		for(int n = 0; n< m; n++) {
			System.out.print("*");
			//*출력
			//n<m
			// 0<1
			// 1<1   (x)조건 불일치 탈출
		}			
			System.out.println();
	}	
		
		
		
	}

}

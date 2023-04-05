package arrayEx;

public class ArrayEx8 {

	public static void main(String[] args) {
		//new int[scores방의 갯수][];
		int[][] scores = new int[2][]; // 방을 두개 만듦
		
//		scores[0] = new int[] {1,2,3};
//		scores[1] = new int[] {1,2};
		//길이는 상관없다
		
		//scores라는 변수의 방 갯수 확인 필요
		for(int i=0;i<scores.length;i++) {	
		     System.out.println("방번호: "+i); 
		     System.out.println("int배열의 길이"+scores[i].length);
		 int[] points = scores[i];
		 
		 for(int j =0; j<points.length;j++){	 
			 System.out.printf("(%d,%d)", i, j); // 방 위치
			 
			 //2차원 배열에서 값에 접근하는 방법
			 System.out.println(points[j]); //진짜 방에 들어가 있는 값
			 System.out.println(scores[i][j]); 
			 
		}
    	}

	}
 }

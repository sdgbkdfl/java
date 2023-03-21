package arrayEx;

public class ArrayEx4 {

	public static void main(String[] args) {
		//string[] args에 값 넣기
		System.out.println(Integer.parseInt(args[0]));
		// 1 로컬 2 테스트 3 운영
		int mode = Integer.parseInt(args[0]);
		if(mode ==1) {
			System.out.println("로컬환경입니다");
		}else if(mode ==2) {
			System.out.println("테스트환경입니다");
		}else if(mode ==3) {
			System.out.println("운영 환경입니다");
		}		
	 	
		

    }
}



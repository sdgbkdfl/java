package arrayEx;

public class ArrayEx10 {

	public static void main(String[] args) {
		//int 타입 선언
        //배열의 값목록 : {1,2,3}
		//배열의 길이를 변경할 수 없으므로 배열의 길이를 늘이거나 중이기 위해서는 새로운 배열을 만들고 기존 배열을 복사한다.
		
		int[] oldArr = {1,2,3};
		int[] newArr = {0,0,0,0,0}; // = new int[5];
		
		for(int i=0;i<oldArr.length;i++) {
			newArr[i] =oldArr[i];
			System.out.println("oldarr"+i+":"+oldArr[i]);
		}
		
		//newArray 출력
		//for문
		System.out.println("==========newArr");
		System.out.println(newArr[i]);//배열 몇번째 방에 있는지
		
		//
		
}
}

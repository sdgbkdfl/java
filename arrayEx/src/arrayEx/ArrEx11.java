package arrayEx;

public class ArrEx11 {

	public static void main(String[] args) {
		//문자가 들어있는 배열 만들기
		
		String[] oldStrArr = {"java", "array", "copy"};
		String[] newStrArr = new String[5];//방 다섯개를 만들겠다는 의미
//새로운 방법 arraycopy 라는 변수
//(원본배열, 복사시작 인덱스,새로운 배열(복사하고자하는), 새배열에 복사를 시작할 인뎃스, 복사할 갯수)
//원본배열에서 시작하고자 하는 인덱스
//내가 어디서부터 복사헤서 넣을건지 시작 인덱스를 선택..
//java 기본 API에서 제공해주는 메소드를 활용해서 배열을 복사
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		
		for(int i=0;i<newStrArr.length;i++) {
			//배열의 값에 접근할때는 배열이름 [인덱스]
			System.out.println(newStrArr[i]);
		}
		System.out.println("----------------------");

		
        //향상된 for문을 이용하는 방법
		//타입 변수명 : 배열의 이름
		// 배열의 요소를 모두 순회 합니다. 0 < 배열명.length
		//값을 변수에 받아오고 있다
		//변수에 배열에 있는 값들을 각각 넣어주고 있음
		//위의 방법과 같은 결과를 출력하지만 훨씬 간단하게 가능
		for(String data : newStrArr) {
			System.out.println(data);
		}
	}

}

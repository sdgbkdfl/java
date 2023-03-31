package com.library;
//실행 클래스
public class Application {

	public static void main(String[] args) {
	 Library lib = new Library();
	 
	 lib.addBook("모순","양귀자");
	 lib.addBook("물고기는 존재하지 않는다","룰루 밀러");
	 lib.addBook("구의 증명","최진영");
	 
	 //책정보출력
	 lib.toString();
	 
	 //책삭제하려면 인덱스 정보 알아야함 -> 인덱스 넣어주기
	 System.out.println("삭제할 책번호를 선택해주세요");
	 int i = 0;
	 
	 //책삭제
	 lib.removeBook(i);
	 
	 //책정보출력
	 lib.toString();
	 
	 System.out.println("대여할 책 번호를 선택해주세요");
	 i =0;
	 //검증 : 책 목록의 사이즈보다 큰 값이 입력되었을때 다시 입력 요청
     //책대여 -> isRent값이 true로 변해야함
	 lib.updateBook(i);
	 
	 //책정보출력
	 lib.toString();
	 System.out.println();
	 
	}

}

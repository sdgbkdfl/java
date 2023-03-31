package com.library;
//book list
import java.util.ArrayList;
import java.util.List;

	public class Library {
		//책 리스트를 생성
		//길이가 자동으로 늘어나면서 자료가 저장됨
		private List<Book> bookList = new ArrayList<Book>();
		public Library() {
			
		}
	
		public Library(List <Book> bookList) { 
			//초기화
		this.bookList = bookList;		
	}
	
		/**
		 * 책추가
		 * @param title
		 * @param author
		 * @return 
		 */
	
		public boolean addBook(String title, String author) {
			//외부에서 가져온 매개변수 활용하여 책 생성
			Book book = new Book(title, author);
		//내가 가진 필드에 추가, 마지막 인덱스에 추가하고 객체 저장 
		return bookList.add(book);
		
	}
		public void removeBook(int index) {
			Book book = bookList.remove(index);
			System.out.println("삭제되었습니다. : ");
			System.out.println(book.toString());
			
		}
		public void updateBook(int index) {	
			/*
			 * 1. 해당 인덱스에 들어있는 책 꺼내오기
			 * 2. 렌트 여부 수정
			 * 3. 책 저장
			 */
			
			Book book = bookList.get(index);
			book.setRent(true); //대여했으니까 true값
			bookList.set(index, book);
			
		}
		
		//책목록을 출력하고자 함
		//메소드 오버라이딩
		@Override
		public String toString() {
			int i =0; 
			//list니까 반복문 활용
			for(Book book : bookList) {
			System.out.println(i+":"+ book.toString());
			}
			
		
		return super.toString();
	}
}

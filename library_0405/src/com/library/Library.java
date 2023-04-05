package com.library;

import java.util.List;

import com.library.dao.Dao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	//책 목록을 필드로 가지고 있음
	//클래스 내부에서 자유롭게 이용하기 위해 필드로 선언.
	//(전역변수)
	
	List<Book>list = null;
	
	//인터페이스는 타입으로 선언 가능
	//인터페이스의 구현체를 이용해 생성
	//나중에databaseDao도 사용할거라 
	//dao인터페이스로 타입 선언함
	//다형성
	Dao dao = new FileDao();
	
	
	//생성자 :  클래스명과 동일, 반환타입 없음
	public Library() {
		//리스트(필드) 초기화 역할		
		list = dao.getList();
		System.out.println(toString());
	}
	@Override
	public String toString() {
		System.out.println("=*=*=*=책목록=*=*=*=");
		String info = "";
		for(Book book :list) {
			info += book.toString()+"\n";
		}
		
		return info;
		
	}
	
	
//-------------------------------------------------------------------------------------------	
	//하는 일 두가지
	//1 책의 정보를 받아 리스트에 등록
	//2 등록 후 리스트를 파일로 출력
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		
		//0.일련번호 중복체크
		for(Book book: list) {
			if(book.getNo()==no) {
				System.err.println("일련번호가 중복되었습니다.\n다시 입력 요망");
				return false;
			}
			
			
		}
		

		
		//1 책 생성
		Book book = new Book(no, title, author, isRent);
		
		
		//2 리스트에 등록
		list.add(book);
		
		
		//3 리스트를 파일로 출력
		boolean res =  dao.ListToFile(list);
		//메서드의 반환 타입이 boolean타입이라 동일 타입으로 반환 받음
		
		
		//4 파일에 정상적으로 등록되지 않은 경우 
		//리스트에서 제거
		if(!res) {
			list.remove(book);
			System.out.println("도서가 등록되지 않았습니다.\n 다시 시도하십시오");
			return false;
		}
		System.out.println("도서가 등록되었습니다.");
		System.out.println(toString());
		return true;
		
		
	}
//------------------------------------------------------------------------------------------	
	
	/**
	 * 책의 일련번호를 입력받아서 리스트에서 삭제 
	 * 리스트 파일로 반환
	 */
	
	
	public boolean deleteBook(int no) {
		
		for(Book book : list) {
			
			//일련번호 입력 받음
			if(no==book.getNo()) {
				
				//리스트에서 삭제함
				list.remove(book);
				
				//리스트를 파일로 출력
			boolean res = dao.ListToFile(list);
			
			if(!res) {
				//파일로 출력이 실패할 경우 책을 다시 리스트에 추가
				list.add(book);
				System.err.println("파일 출력 중 오류가 발생"); 
					return false;
			
			}
			System.out.println("도서를 삭제하였습니다.");	
			System.out.println(toString());
				
			}
			
			System.err.println("일련번호에 해당하는 도서를 찾지 못했습니다.");
			return false;
			
			
		}

		
		return false;
	}
	
//------------------------------------------------------------------------------------------	
	/**
	 * 일련번호에 해당하는 책을 찾고
	 * 대여 가능한 상태라면 대여(isRent = false) -> (isRent = true)
	 * 대여 불가 상태일시 메세지 처리
	 * 리스트를 파일로 출력
	 * 
	 * @param no
	 * @return
	 */
	
	public boolean rentBook(int no) {
		for(Book book : list) {
			
			//일련번호에 해당하는 책 찾기
			if(no==book.getNo()) {
			
				if(book.isRent()) {
					System.out.println("대여중인 도서입니다.");
					return false;
				}
				//렌트 상태가 됨(책 상태(메모리 값) 변경)
				book.setRent(true);
				
				//파일 출력
				//dao.ListToFile(list);
				
				boolean res = dao.ListToFile(list);
				if(!res) {
					book.setRent(false);
					System.out.println("파일로 출력하는데 실패했습니다");
				}
				
				System.out.println("대여되었습니다.");
				System.out.println(toString());
				return true;
				
			}
			
		}
		System.err.println("일련번호를 찾을 수 없습니다.");
		return false;
	}
	
	
//------------------------------------------------------------------------------------------	
	/**
	 * 일련번호에 해당하는 도서를 찾는다
	 * 도서가 대여중(true)이라면 반납 처리
	 * 아니면 메세지 처리
	 * @param no
	 * @return
	 */
	
	public boolean returnBook(int no) {
		
		for(Book book : list) {
			
			if(no==book.getNo()) {
				
				if(!book.isRent()) {
					System.err.println("반납 가능한 도서가 아닙니다.");
					return false;
				
				}else {
					
					//반납처리
					book.setRent(false);
					dao.ListToFile(list);
					System.out.println("도서가 반납되었습니다");
					System.out.println(toString());
					return true;
					
				}
				
				
			}
			
			
			
		}
		System.err.println("일련번호를 찾을 수 없습니다.");
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
}

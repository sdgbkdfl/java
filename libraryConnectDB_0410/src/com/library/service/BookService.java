package com.library.service;
//사용자 요청 검증, 데이터베이스 조회 DB RUD요청, 사용자요구에 맞게 반환
//Dao호출
import java.util.List;

import com.library.dao.conn.BookDao;
import com.library.vo.BookVo;

public class BookService {

	//비지니스 로직 작성
	
	//책 조회할 수 있도록 dao생성
	BookDao bookDao = new BookDao();
	
	
	public void getList() {
		List<BookVo> list = bookDao.getList();
		
		for(BookVo book : list) {
			System.out.println(book.toString());
			
		}
		
	}

	public int insertBook(BookVo bookVo) {
		int res = bookDao.insertBook(bookVo);
		if(res>0) {
			System.out.println("입력되었습니다.");
		}else {
			System.out.println("오류발생");
		}
		
		return res;
	}

	public void deleteBook(int bookNo) {
		int res = bookDao.deleteBook(bookNo);
		if(res>0) {
			System.out.println("삭제됨");
		}else {
			
		}
	}
	//책이 대여 가능한 상태인지 확인
	//가능하면 대여 처리
	//아니면 메세지

	public void rentBook(int bookNo) {
		//대여가능 확인
		
		
		boolean flg = selStatus(bookNo, "N");
		if(flg) {
			int res = bookDao.updateBook(bookNo, "Y");
			if(res>0) {
				System.out.println("대여완료!!");
			}else {
				System.out.println("대여중 문제 발생");
			}
		}else {
			System.out.println("대여가 불가능한 상태임");
		}
		
		
	}
	
	//도서 상태(대여/반납) 조회하는 메서드 생성
	public boolean selStatus(int no, String rentYN) {
		boolean res = bookDao.selStatus(no, rentYN);
		return res;
	}

	public void returntBook(int bookNo) {
		boolean flg = selStatus(bookNo, "Y");
		if(flg) {
			int res = bookDao.updateBook(bookNo, "N");
			if(res>0) {
				System.out.println("반납되었습니다");
				getList();
				
			}else {
				
			}
		}
		
	}


}


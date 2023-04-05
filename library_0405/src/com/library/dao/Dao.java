package com.library.dao;

import java.util.List;

import com.library.vo.Book;

//데이터 입출력 관리
public interface Dao {
	
	//파일 읽어서 리스트 반환
	List<Book> getList();
	
	
	//리스트 파일로 출력
	boolean ListToFile(List<Book> list);
	



	
}

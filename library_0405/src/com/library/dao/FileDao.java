package com.library.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao{
	//파일 입출력
	
	
	@Override
	public List<Book> getList() {
	//파일로부터 데이터를 읽어서 리스트로 반환*
		
	//	System.out.println("FileDao.getList() 시작");
		
		//리스트 선언*
		List list =new ArrayList<>();
		
			//파일에 있는 문자 읽어옴*
		try(FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr);) {					
				//한줄씩 읽어옴
				//파일의 끝 (EOF) = null
				String readLine = "";
				//null이면 반복문 탈출
				while((readLine = br.readLine()) !=null) {
				//문자열을 이용해서 Book객체를 생성해서 반환하고자 함(메서드 생성)
					Book book = makeBook(readLine);
					//생성된 객체를 리스트에 담아줌
					
					//책이 정상 생성되었을 경우만 값 반환
					if(book !=null ) {
						list.add(book);
					}
				
					
				}

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			//e.printStackTrace();
			
		} catch (IOException e1) {	
			System.out.println(e1.getMessage());
			//e1.printStackTrace();
		}
		
		
	//	System.out.println("FileDao.getList() 종료");
		
		return list;
		
	}
//----------------------------------------------------------------------
	
	/**
	 * 문자열을 가공하여 
	 * book객체 생성
	 * @param readLine
	 * @return
	 */
	
	//메서드 생성
	private Book makeBook(String readLine) {
		
		//Book book = null; 할 경우 가장 마지막에 return book;반환
		
		try {
			
			
			//공백을 기준으로 배열로 저장*
			String[] strArray =readLine.split(" ");
			
			
			//강제 형 변환 시 오류가 발생할 수 있고
			//또는 파일이 올바르지 않은 형태로 저장되어 있을 경우 오류 발생!
			//프로그램에서 오류가 발생할 경우 프로그램이 비정상적으로 종료되는 것을 
			//막기 위해서 예외처리햬줌
			
			//문자열을 int로 변환
			//book을 생성하기 위해 알맞은 타입으로 저장*
			int no = Integer.parseInt(strArray[0]);
			String title = strArray[1];
			String author = strArray[2];
			//문자열을 boolean으로 반환
			boolean isRent = Boolean.parseBoolean(strArray[3]);
			
			//책을 생성*
			Book book = new Book(no, title, author, isRent);
			//책을 반환*
			return book;
			

			
			
		} catch (Exception e) {
			//문자열 파싱중 오류가 발생했을경우 
			//메세지 처리, return null
			System.out.println(readLine + ":파싱중 오류 발생 ");
			//오류발생 할 경우 null 반환*
			return null;
			
		}

		
	}//makeBook메소드 종료

//----------------------------------------------------------------------
	
	/**
	 * 리스트를 매개변수로 받아 
	 * 파일로 출력
	 */
	public boolean ListToFile(List<Book> list) {
		
		try(FileWriter fw = new FileWriter("bookList_copy.txt");) {
			
			//BufferedWriter bw = new BufferedWriter(list);
			
			//리스트에 담긴 책의 정보를 파일로 출력
			for(Book book:list) {
				fw.write(book.toString());
			}
			fw.flush();
			
			return true;
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			// TODO: handle exception
		}

		
		
		return false;
	}




	
	
	







	
	
	
	
	
	
	
}

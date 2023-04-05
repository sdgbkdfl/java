package com.library;

import java.util.Scanner;

//import java.util.ArrayList;
//import java.util.List;
//
//import com.library.dao.FileDao;
//import com.library.vo.Book;

public class Application {

	//필드로 빼줌
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		//라이브러리 생성
		Library lib = new Library();
		
//		FileDao dao = new FileDao();
//		
//		List<Book>list = dao.getList();
//		
//		for(Book book : list) {
//			System.out.println(book.toString());	
//		}
		
//		FileDao dao = new FileDao();
//		List<Book>list = new ArrayList<>();
//		list.add(new Book(3, "오늘은", "우리는", false));
//		dao.ListToFile(null);
		
		
//		app 생성하지 않고 getString(), getInt()메서드 사용 불가
//		main메소드는 static 메소드 정적메서드
//		정적필드에서는 인스턴스필드 사용 불가하므로 
//		생성자 생성 후 사용 
//		혹은 getString(), getInt()메서드를 
//		정적멤버 (static)로 만들어 사용
		
//		Application app = new Application();
		
		
		
		
//-----------------------------------------------------------------------		
		//admin 책 등록, 책 삭제
		//사용자 책 대여, 책 반납
		
		outter: //끝내고 싶은 반복문 
		while(true){
			

			//자주 사용하는 로직은 메서드로 빼서 만들면 코드 간결해짐
			//스캐너로 입력받아 리턴해주는 역할
			//로그인
			//id입력 받아서 admin이면 관리자 아니면 사용자
			
			System.out.println("ID : ");
			
			String id = scan.next();
			
			if(id.equals("q")) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
				
			while(true) {
				if(id.equalsIgnoreCase("admin")) {
					System.out.println("관리자 메뉴입니다.");
					System.out.println("-----------------------------------------------");
					System.out.println("1. 도서등록| 2. 도서삭제| 3. 로그아웃| q. 프로그램 종료");
					System.out.println("-----------------------------------------------");
					System.out.println("메뉴를 입력해주세요");
					
					int menu = getInt();
					int no = 0;
					
					
					switch (menu) {
					case 1: //도서등록
						System.out.println("일련번호를 입력<등록>");
						no = getInt();
						System.out.println("제목 입력");
						String title = getString();
						System.out.println("작가 입력");
						String author = getString();
						
						lib.insertBook(no, title, author, false);
						
						break;
						
						
					case 2: //도서삭제 
						System.out.println("일련번호 입력<삭제>");
						no = getInt();
						lib.deleteBook(no);
						
						
						
						break;
						
						
						
					case 3: //로그아웃
						System.out.println("로그아웃 완료");
						
						
						break; //=>switch문을 벗어남
						
						
						
						
					default:
						System.err.println(menu+"잘못 선택하셨습니다.");
						break;
					}	
					
			
			
			}	
//-----------------------------------------------------------------------		
			
				
			
			else {
				
					System.out.println(id+"님 환영합니다.");
	
					System.out.println("이용자 메뉴입니다.");
					System.out.println("-----------------------------------------------");
					System.out.println("1. 도서대여| 2. 도서반납| 3. 로그아웃| q. 프로그램 종료");
					System.out.println("-----------------------------------------------");
					System.out.println("메뉴를 입력해주세요");
					
					int no = getInt();
					
					switch (no) {
					
					case 1:
						System.out.println("일련번호를 입력<대여>");
						no = getInt();
						lib.rentBook(no);
						break;
						
						
					case 2:
						System.out.println("일련번호를 입력<반납>");
						no = getInt();
						lib.returnBook(no);
						
						break;
						
						
					case 3:
						System.out.println("로그아웃 되었습니다.");
						
						break;
						
					default:
						System.err.println(no+"잘못 선택하셨습니다.");
						break ;
					}
						}
					
				}
				
		}	
			
			
		}
			
				


				
				
				
			
			
		
			
		
		
		
		
		
//------------------------------------------------------------------------		
//		
//		//책추가
//		lib.insertBook(1, "모순", "양귀자", false);		
//		lib.insertBook(2, "가재가 노래 하는 곳", "델리아 오언스", false);		
//		
//		//lib.toString()/lib
//		//toString()작성 안해주고 객체만 넣어줘도 
//		//시스템에서 자동으로 toString() 처리해줌
//		
//		System.out.println(lib.toString());
//		
//		
//		
//		
//		//책삭제
//		int no = 0;
//		boolean res = lib.deleteBook(1);
//		
//		
//		
//		res = lib.rentBook(2);		
//		res = lib.returnBook(2);
		
	
	
	//메인 메서드 밖에 새로운 메서드 구현
	
	/**
	 * 사용자로부터 입력받은 문자열을 반환
	 * 숫자 입력시 재 입력 요청
	 * Q,q 입력될 경우 프로그램 종료
	 * @return
	 */
	
	
	public static String getString() {
		
		String str = " ";
		
		
		
		while(true) {
			try {
				str = scan.next();
				
				if(str.equalsIgnoreCase("Q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				
				
				
				//숫자일 시 문자로 입력해달라 요청
				Integer.parseInt(str);
				System.out.println("문자를 입력해주세요");
				
				
				
			} catch (Exception e) {
				//문자가 입력된 경우 반복문 탈출
				break;
			
				}
			
			
		}
		return str;
	}
//-----------------------------------------------------------------------------	
	/**
	 * 사용자로부터 정수 입력받아 반환
	 * 문자입력경우 재입력 요청
	 * q Q경우 프로그램 종료
	 * @return
	 */
	
	
	public static int getInt() {
				
		
		int i = 0;
		
		while(true) {
			
			try {
				String str = scan.next();
				//사용자가 프로그램 종료할건지 물어볼려고 String값 먼저 받음
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					
				}
				//종료(q Q)아니면
				//숫자로 변환
				i =Integer.parseInt(str);
				
				break;//반복문 탈출
				
			} catch (Exception e) {
				//오류 입력 시 다시 사용자 입력으로 ->while
				System.out.println("입력중 오류가 발생했습니다. \n숫자 입력 요망");
			}
	
			
		}
		
		return i;
		
		
	}
	


}

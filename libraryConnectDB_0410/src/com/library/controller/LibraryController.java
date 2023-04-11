package com.library.controller;
//사용자 요청을 받아 

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.vo.BookVo;
import com.library.vo.MemberVo;

public class LibraryController {
	
	BookService bookService = new BookService();
	MemberService memberService = new MemberService();

	public void start() {
		System.out.println("============================");
		System.out.println("온라인 도서관에 오신 것을 환영합니다.");
		System.out.println("============================");
		
		
		while(true) {
			//로그인 요청
			MemberVo memberVo = login();
			
			//도서목록 출력
			bookService.getList();
			
			if("Y".equalsIgnoreCase(memberVo.getAdminYN())) {
				//관리자 계정
				adminMenu();
				
			}else
				//시용자 계정
				userMenu();
		}
			
	}

	public void adminMenu() {
		
		outter:
		while(true) {
			System.out.println("=*=관리자 메뉴=*=");
			System.out.println("| 1. 도서 등록 | 2. 도서삭제 | 3. 사용자등록 | 4. 사용자삭제 | 0 :이전메뉴 | q. 종료");			
			System.out.println("번호를 입력해주세요");
			
			int menu = getInt();
			int bookNo = 0;
			String id = "";
			
			
			switch (menu) {
			case 1:
				//도서등록
				System.out.println("<등록> 도서 일련번호를 입력해주세요");
				bookNo = getInt();
				
				System.out.println("도서명을 입력해주세요");
				String title = getString();
				System.out.println("작가를 입력해주세요");
				String author = getString();
				System.out.println("대여여부를 입력해주쇼");
				String rentYN = getString();
				
				
				bookService.insertBook(new BookVo(bookNo, title, author, rentYN));

				break;
				
			case 2:
				//도서삭제
				System.out.println("<삭제> 도서 일련번호를 입력해주세요");
				bookNo = getInt();
				bookService.deleteBook(bookNo);

				break;
				
			case 3:
				//사용자 등록
				System.out.println("아이디 입력 ㄱ");
				id = getString();
				System.out.println("비번 입력 ㄱ");
				String pw = getString();
				System.out.println("이름 입력 ㄱ");
				String name = getString();
				System.out.println("관리자 계정은 Y 입력 바람");
				String adminYNStr = getString();
				String adminYN = adminYNStr.equalsIgnoreCase("y")     ?    "Y"    :     "N";
				
				MemberVo memberVo = new MemberVo(id, pw, name, adminYN);
				
				memberService.insertMember(memberVo);

				break;
				
			case 4:				
				//사용자 삭제				
				System.out.println("삭제할 사용자 ID를 입력해주세요");
				id = getString();
				memberService.deleteMember(id);
				break;
				
			case 0:
				
				break outter;
				
			default:
				System.err.println("메뉴 확인 후 다시 입력해주세요.");
				break;
			}
			
			
		}
			
		}
		
	
		
		
		
	
	public void userMenu() {
		
		System.out.println("=*=사용자 메뉴=*=");
		
		while(true) {
			System.out.println("| 1. 도서대여 | 2. 도서반납 | 0 :이전메뉴 | q. 종료");
			int menu = getInt();
			int bookNo =0;
			
			switch (menu) {
			case 1:
				//도서대여
				System.out.println("대여 도서의 일련번호 입력");
				bookNo = getInt();
				bookService.rentBook(bookNo);
				break;
				
			case 2:
				//도서반납
				System.out.println("반납할 도서 일련번호 입력");
				bookNo = getInt();
				bookService.returntBook(bookNo);
				
				break;
				
				
				
			case 0:
				
				return;
				
			default:
				System.out.println("메뉴를 다시 선택하세yo");
				break;
			}
			
		}//while문 종료
		
		
	}
	
	
	
	
	
	
	
	//로그인 요청
	/**
	 * 아이디 패스워드를 입력받아서 일치하는 사용자 있는지 확인
	 * @return
	 */
		
	public MemberVo login() {
		System.out.println("아이디 입력 :");
		String id = getString();
		System.out.println("비밀번호 입력 :");
		String pw = getString();
		MemberVo memberVo = memberService.login(id, pw);
		if(memberVo !=null) {
			//로그인 성공
			return memberVo;
	
		
		
		}
		return memberVo;
	}	
	
	public static Scanner scan = new Scanner(System.in);
	public static String getString() {
		
		String str = " ";
		
		str = scan.next();
		if(str.equalsIgnoreCase("q")) {
			System.exit(0);
		}
		
		return str;

	}	
	public static int getInt() {
		int i =0;
		String str;
			
		try {
			str = scan.next();
			if(str.equalsIgnoreCase("q")) {
				System.exit(0);
			}
			i = Integer.parseInt(str);
			return i;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("숫자 입력 중 오류 발생 ");
	
		}
		return i;	
		
	
	}
}
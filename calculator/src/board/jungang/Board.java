package board.jungang;

public class Board {
	//필드정의(속성)
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	
	//메소드와 비교했을때 생성자의 특징
	//1 클래스이름과 동일
	//2 반환 타입이 없다	
	public Board(String title, String content, String writer, String date, int hitcount) {
	//생성자 : 필드초기화
	this.title = title;
	this.content = content;
	this.writer =writer;
	this.date = date;
	this.hitcount = hitcount;		
	}
	
	public Board(String title) {
	this(title,"내용","작성자","날짜",0);
	}	
	
	public Board(String title, String content) {
	this(title, content, "작성자","날짜",0);
	}
}


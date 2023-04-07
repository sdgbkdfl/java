package com.library.vo;

public class Book {
	
	//일련번호
	private int no;
	private String tilte;
	private String author;
	private boolean isRent;
	
	
	//생성자
	public Book(int no, String tilte, String author, Boolean isRent) {
		//super();
		this.no = no;
		this.tilte = tilte;
		this.author = author;
		this.isRent = isRent;
		
	
		
	}
	
	@Override
	public String toString() {
		
		return getNo()+" "
				+getTilte()+" "
				+getAuthor()+" "
				+isRent();
				
	}
	//대여중인걸 보여줄라고 함
	public String info() {
		String str="";
		if(isRent) {
			str = "대여중";
		}
		return getNo()+" "
				+getTilte()+" "
				+getAuthor()+" "
				+str;
			}
	
	
	
	
	public void setRent(boolean isRent) {
		this.isRent = isRent;
	
	
	}
	
	//getter/setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTilte() {
		return tilte;
	}
	public void setTilte(String tilte) {
		this.tilte = tilte;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isRent() {
		return isRent;
	}
	
	
	
	
	
	
	
	
	
}

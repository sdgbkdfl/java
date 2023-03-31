package com.library;

public class Book {

	//책 정보값
	private String title;
	private String author;
	private boolean isRent; // 기본값 false로 가지기 때문에 생성 필요 없음 / 대여여부 확인
	
	@Override
	public String toString() {
		String str = " ";
		if(isRent){
			str = "대여중";
		}
		return getTitle()+"/"+getAuthor()+"/"+ str;
		}
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}

}

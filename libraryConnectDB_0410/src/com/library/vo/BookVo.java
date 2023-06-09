package com.library.vo;

public class BookVo {
	
	//필드
	private int bookNo;
	private String title;
	private String author;
	private String rentYN = "N";
	
	
	
	
	//generate constructor using fields
	public BookVo(int bookNo, String title, String author, String rentYN) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.rentYN = rentYN;
		
	}
	
	@Override
	public String toString() {
		String str = getRentYN().equals("Y")? "대여중": "";
		return getBookNo()+ " "+
				getTitle()+ " "+
				getAuthor()+ " "+ str;
						
	}
	
	public String info() {
		return getBookNo() 
				+ " " + getTitle() 
				+ " " + getAuthor() 
				+ " " + getRentYN();
	}
	
	
	//getter setter
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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

	public String getRentYN() {
		return rentYN;
	}

	public void setRentYN(String rentYN) {
		this.rentYN = rentYN;
	}


}

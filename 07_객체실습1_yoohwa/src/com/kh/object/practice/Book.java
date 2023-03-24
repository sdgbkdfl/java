package com.kh.object.practice;

public class Book {
	
	// 필드 
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	//기본생성자
	public Book() {		
	}
	
	//매개변수 생성자
	public Book(String title,int price, double discountRate,String author) {
	
	//초기화
	this.title = title;
	this.price = price;
	this.discountRate = discountRate;
	this.author = author;	
	}
	public void print() {
		System.out.println(
				    getTitle() +
					"\t" +getPrice() +
					"\t" +getDiscountRate() +
					"\t" +getAuthor()
					);
	}

		
	

public String information() {
	return null;
	//getTitle +" "+ getPrice +" "+ getDiscountRate+ " " + getAuthor;
}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

		
		
	}
 
 


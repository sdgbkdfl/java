package com.jung.object;

public class ProductEx {

	//필드
	private String id;
	private int price;
	private double tax;
	
	
	//생성자
	public ProductEx(String id, int price, double tax) {
		this.id = id;
		this.price = price;
		this.tax = tax;
		
	}
	
	//반환타입
	
	public String information() {
		return getId()+" "+getPrice()+" "+getTax();
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	
	
}

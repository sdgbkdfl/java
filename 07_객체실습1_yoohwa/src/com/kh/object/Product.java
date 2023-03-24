package com.kh.object;

public class Product {

	
	//필드
	private String id;
	private String name;
	private String site;
	private int price;
	private double tax;
	
	//생성자
	public Product() {
	
	//리턴값 모를 때, 참조타입이면 null, ""
	//메소드 이용하기 위해 리턴타입에.... 
	
		/**
	 * 모든 필드의 정보를 출력합니다.
	 * @return
	 */
		

	public String information() {
		return getId()+getname();
	}	
	/**
	 * 가격을 계산하고 출력합니다.
	 */
	public void calc() {
		System.out.println("상품명 = "+getName());
		System.out.println("부가세를 포함한 가격 = "+getprice()+(getprice()*getTax())+"원");
	}
	//setter(), getter()
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
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
	
	
	
	
	
	
	
	
	
	
	

	


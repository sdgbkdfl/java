package com.jung.object;

public class ProductExMain {

	public static void main(String[] args) {
		ProductEx product1 = new ProductEx("ssgnote9",960000,10.0);
		ProductEx product2 = new ProductEx("lgxnote5",780000,0.7);
		ProductEx product3 = new ProductEx("ktsnote3", 250000,0.3);
				
		//생성된 객체를 통해 호출
		
		System.out.println(product1.information());
		System.out.println(product2.information());
		System.out.println(product3.information());
		
		System.out.println("======================");

	
		product1.setPrice(120);
		product2.setPrice(120);
		product3.setPrice(120);
		
		product1.setTax(0.05);
		product1.setTax(0.05);
		product1.setTax(0.05);
		
		System.out.println(product1.information());
		System.out.println(product2.information());
		System.out.println(product3.information());
		
		System.out.println("======================");
		
	
		

	}

}

package com.kh.object.practice;

public class Application {

	public static void main(String[] args) {
		
		Book book = new Book();
		Book book1 = new Book("자바의정석",20000, 0.2,"윤상섭");
		
		book.print();
		book1.print();
		
		System.out.println("=====================");
		
//		System.out.println(
//		 book.getTitle() +
//		"\t" +book.getPrice() +
//		"\t" +book.getDiscountRate() +
//		"\t" +book.getAuthor()
//		);
//		
//		System.out.println(
//		"\t" + book1.getTitle() +
//		"\t" +book1.getPrice() +
//		"\t" +book1.getDiscountRate() +
//		"\t" +book1.getAuthor()
//		);
		
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		
		book1.print();
		
			
		
		
		public void print() {
				System.out.println("도서명:"+getTitle());
				
				int price = (int)(getPrice() - (getPrice()*getDiscountRate()));
				System.out.println("할인된 가격:"+getPrice());
				
				System.out.println("도서명:"+getTitle());
				System.out.println("할인된 가격:"+getPrice());

	}
		
	
		}

}

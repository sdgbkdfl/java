package connection;

public class Book {
	int no;



	String title; 
	String author;
	
	public Book(int no, String title, String author) {
		super();
		this.no = no;
		this.title = title;
		this.author = author;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	
	
	
	@Override
	public String toString() {
		
		return getNo()
				+ getTitle()
				+ getAuthor();
				
				
				
				
				
				
				
				
				
	}
	
	
}

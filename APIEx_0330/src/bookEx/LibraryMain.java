package bookEx;

public class LibraryMain {
//도서관 생성
	public static void main(String[] args) {
		Library lib = new Library();
		//책 생성  
		lib.addBook();
		//재정의된 메소드 호출
		System.out.println(lib.toString());
		

	}

}

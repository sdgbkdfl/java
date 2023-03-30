package bookEx;

public class Library {

		private Book[] bookArry = new Book[5];
		
		//book을 초기화
		public void addBook() {
			bookArry[0] = new Book("혼공자", "신영권 ");
			bookArry[1] = new Book("물고기는 존재하지않는다", "룰루 밀러 ");
			bookArry[2] = new Book("구의 증명", "최진영");
			bookArry[3] = new Book("채식주의자", "한강");
			bookArry[4] = new Book("모순", "양귀자");
		
			
			//System.out.println(lib.toString());
			// 실행하면 주소값이 나오기 때문에
			// toString()메소드를 오버라이드하여 재정의
			// 재정의 해주면 객체정보를 문자열로 반환함
	}
	@Override
	public String toString() {
		String str = ""; //반환값 초기화
		for(Book b: bookArry) {
			str+= b.getTitle()+ " "+ b.getAuthor()+"\n";
			//str+=는 기존 문자열 str에 새로운 문자열을 추가하는 연산자
		}
		return str;
	}
	
	}


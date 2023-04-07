package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
	public static void main(String[] args) {
		BookDao dao = new BookDao();
		//dao.insert(10,"채식주의자", "한강");	
		//dao.delete();
		//dao.update();
		
		System.out.println("책 리스트");
		List<Book>list = dao.getList();
		for(Book book : list) {
			System.out.println(book.toString());
			
		}
	}
	public void insert(int no, String title, String author) {
		//데이터 삽입
		Connection conn;
		
		try {
			conn = DBUtill.getConnection();
			Statement stmt = conn.createStatement();
			
			String sql = "INSERT into book1 values("+no+", '"+title+"' , '"+author+"')";
			int res = stmt.executeUpdate(sql);
			
			System.out.println(res+"건 처리되었습니다.");
			
			//자원반납
			DBUtill.closeConnection(conn, null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//데이터 업데이트
	public void update() {
		try {
			Connection conn	= DBUtill.getConnection();
			Statement stmt = conn.createStatement();
			
			int res = stmt.executeUpdate("update book1 set author  ='권여선' where title='모순'");
			
			System.out.println(res+"건 수정되었습니다.");
			System.out.println("대기");
			//Thread.sleep(5000);
			
			DBUtill.closeConnection(conn, stmt);
			System.out.println("자원 반납");
			System.out.println("대기");

			
		} catch (Exception e) {
			
	
			
		}


		
	}
	//데이터 삭제
	public void delete() {
		try {
			
			
			
			Connection conn	= DBUtill.getConnection();
			Statement stmt;
			stmt = conn.createStatement();
			int res = stmt.executeUpdate("delete from book where no =10");
			System.out.println(res+"건 처리되었습니다.");
			
			DBUtill.closeConnection(conn, stmt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//데이터 조회 - 결과집합 받아와야함
	public List<Book> getList() {
		
		List<Book> list = new ArrayList<>();
		
		try {
			Connection conn	= DBUtill.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book1 order by no");
			
			while(rs.next()) {
			int no =	rs.getInt("no");
			String title =	rs.getString(2);
			String author =	rs.getString(3);
				
			Book book = new Book(no, title, author);
			list.add(book);
			
			}
			
			DBUtill.closeConnection(conn, stmt);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
		
	}
	
}

package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCEx {

	public static void main(String[] args) {
		JDBCEx ex = new JDBCEx();
		ex.update();
	}

	public void getList() {
		//데이터베이스 접근시 필요 정보
		String url = "jdbc:oracle:thin:@localhost:1522:orcl";
		String id = "orauser";
		String pw = "1234";
		Connection conn;

		try {
			// 클래스 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 얻기
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 성공!  " + conn);

			// 쿼리 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 쿼리 실행 후 결과 집합 받아오기
			ResultSet rs = stmt.executeQuery("SELECT  * FROM BOOK1");

			List<Book> list = new ArrayList<>();

			while (rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);

				Book book = new Book(no, title, author);

				list.add(book);	
				System.out.println(rs.getInt(1));
				//System.out.println();
				rs.getString(2);
			}
			// 시스템 출력
			System.out.println(list);
			for (Book book : list)
				System.out.println(book.toString());
			
			//rs는 while에서 끝났는데 또 출력하려고 하니 오류 발생 
			//System.out.println("조회결과 : " + rs.getString(1));

			rs.close();
			stmt.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//	public void getInsert() {
//		// 결과에 대해 int로 반환
//		Connection conn;
//
//		String url = "jdbc:oracle:thin:@localhost:1522:orcl";
//		String id = "orauser";
//		String pw = "1234";
//
//		// 클래스 로딩
//		// 커넥션 얻기
//		// 쿼리 실행 객체 생성
//		// 쿼리 실행 후 결과 집합 받아오기
//
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection(url, id, pw);
//			System.out.println("커넥션 성공!  " + conn);
//
//			Statement stmt = conn.createStatement();
//
//			// 몇 건이 처리되었는지 반환
//			int res = stmt.executeUpdate("INSERT into book1 values(2, '안녕 주정뱅이' , '권여선')");
//
//			System.out.println(res + "건 처리되었습니다.");
//
//			stmt.close();
//			conn.close();
//
//		} catch (ClassNotFoundException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}

	public void Tesconnection() {
		

		// getList끝
		// 데이터베이스 접근시 필요 정보
		// id,port,sid, 계정정보, 비번
		String url = "jdbc:oracle:thin:@localhost:1522:orcl";
		String id = "orauser";
		String pw = "1234";

		Connection conn;

		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 얻기
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 성공" + conn);
			// 쿼리 실행 시 필요 객체
			Statement stmt = conn.createStatement();

			// 연결완료

			// 데이터 조회
			// executeQuery (쿼리문장입력)/ 쿼리문장입력은 디벨롭퍼에서
			// ResultSet : 결과집합
			ResultSet rs = stmt.executeQuery("select count (*) from Book1");
			// 읽어오기
			rs.next();
			System.out.println("조회결과: " + rs.getString(1));

			// 자원반납
			rs.close();
			stmt.close();
			conn.close();

			// 데이터 생성 수정 삭제
			stmt.executeUpdate("");

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Delete() {
		
		String url = "jdbc:oracle:thin:@localhost:1522:orcl";
		String id = "orauser";
		String pw = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver,Oracledriver");
			
			Connection conn = DriverManager.getConnection(url, id, pw);
			System.out.println("오토커밋 - false설정");
			conn.setAutoCommit(false);//자동 커밋을 하지 않음
			Statement stmt =conn.createStatement();
			
			int res = stmt.executeUpdate("delete from book1");
			System.out.println(res+"건 처리되었습니다.");
			conn.rollback();
			System.out.println("롤백 되었습니다.");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public void update() {
		

		//데이터 베이스 접근 시 필요한 정보
		String url = "jdbc:oracle:thin:@localhost:1522:orcl";
		String id = "orauser";
		String pw = "1234";
		
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver,Oracledriver");
			
			//DB연결설정
			Connection conn = DriverManager.getConnection(url, id, pw);
	
			
			//쿼리실행 객체 생성
			Statement stmt =conn.createStatement();
			
			//쿼리실행
			int res = stmt.executeUpdate("update book1");
			
			//결과 출력
			System.out.println(res+"건 처리되었습니다.");
			
			stmt.close();
			conn.close();
			

		} catch (ClassNotFoundException e) {
			System.out.println(" jdbc 라이브러리를 확인해주세요");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
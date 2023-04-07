package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.connection.DBUtill;
import com.library.vo.Book;

public class DatabaseDao implements Dao{

	List<Book> list = new ArrayList();
	@Override
	public List<Book> getList() {
		try {
			Connection conn = DBUtill.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book1 order by no");
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String title =	rs.getString("title");
				String author =	rs.getString(3);
				
				//Y,N isRent -> 삼항식
                //boolean isRent = ("Y".equals(isRentStr))?true:false;
				

				Book book = new Book(no, title, author, false);
				list.add(book);
		}	
			DBUtill.closeConnection(rs, conn, stmt);
			
		} catch (Exception e) {

		}
			
			return list;
		

	}

	@Override
	public boolean ListToFile(List<Book> list) {
		
		return false;
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int no) {
		int res = 0;
		try {
			Connection conn = DBUtill.getConnection();
			Statement stmt;
			stmt = conn.createStatement();
			int i = stmt.executeUpdate("update book1 set author  ='룰루밀러' where title='물고기는 존재'");
			
			System.out.println(res+"건 업데이트되었다.");
			
			DBUtill.closeConnection(conn, stmt);
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int insert(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

}

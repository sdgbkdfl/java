package com.library.dao.conn;
//데이터 입출력


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.BookVo;

public class BookDao {

	int res =0;
	
	//조회
	public List<BookVo> getList(){
		
		List<BookVo> list = new ArrayList<>();
		
		String sql = "select * from book order by bookNo";
		
		try(Connection conn = DBUtill.getConnection();
				Statement stmt = conn.createStatement();
				) {
			
				ResultSet rs = stmt.executeQuery(sql);
						
			while(rs.next()) {
				int bookNo = rs.getInt("bookNo");
				String title =	rs.getString("title");
				String author =	rs.getString("author");
				String rentYN =rs.getString("rentYN");
			
			BookVo bookvo = new BookVo(bookNo, title, author, rentYN);
			list.add(bookvo);
		}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return list;
	}
//------------------------------------------------------------------------------------------
	public int insertBook(BookVo bookVo) {
		
		String sql = "insert into book values (?, ?, ?, ?)";
	
		
		try(Connection conn = DBUtill.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
				) {
			System.out.println(sql);
			pstmt.setInt(1, bookVo.getBookNo());
			pstmt.setString(2, bookVo.getTitle());
			pstmt.setString(3, bookVo.getAuthor());
			pstmt.setString(4, bookVo.getRentYN());
			res = pstmt.executeUpdate(sql);
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return res;
		
	}
//--------------------------------------------------------------------------------------------
	public int deleteBook(int bookNo) {
		
		String sql = "delete from book where bookno= ?";

		
		try(Connection conn = DBUtill.getConnection(); //커넥션 얻어옴
			PreparedStatement pstmt = conn.prepareStatement(sql);
				) {
			
			//쿼리 실행
			 res = pstmt.executeUpdate(sql); 
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return res;
	}
//--------------------------------------------------------------------------------------------------	
	//대여 반납 가능한 상태라면 true 아니면 false
	public boolean selStatus(int no, String rentYN) {
		
		boolean res = false;
		
		String sql ="select * from book where bookno = ? and rentyn=?"; 
		
		try(Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				) {
			
			
			//?를 매개값으로 치환
			pstmt.setInt(1, no);
			pstmt.setString(2, rentYN);
			
			ResultSet rs = pstmt.executeQuery();
			
			res = rs.next() ? true : false;
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return res;
	}
	
//---------------------------------------------------------------------------------------------------	
	public int updateBook(int bookNo, String rentYN) {
		
		String sql ="update book set rentYN =? where bookno=?";
		
		try(Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);

				) {
			//?의 순서대로 인덱스 부여
			pstmt.setString(1, rentYN);
			pstmt.setInt(2, bookNo);
			
			res = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return res;
	}
}

package com.library.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtill {
	
	/**
	 * DB커넥션은 생성하여 반환
	 * @return
	 */
	
	public static Connection getConnection() {
		//접속정보                                   port : sid
		String url = "jdbc:oracle:thin:@localhost:1522:orcl";
		String id = "orauser";
		String pw = "1234";
		
		Connection conn = null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			//롤백하지 않고 커넥션 종료 되면 커밋
			//커넥션 종료될때 커밋
			conn.setAutoCommit(false);
			
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection(Connection conn, Statement stmt){		
			try {
				if(conn != null && !conn.isClosed()) conn.close();
				if(stmt != null && !stmt.isClosed()) stmt.close();
			//	if(rs != null && !rs.isClosed()) rs.close();

				
			} catch (SQLException e) {
				// TODO Auto-generated catch blocks
				e.printStackTrace();
			}
			
		
	}
	public static void closeConnection(ResultSet rs, Connection conn, Statement stmt){		
		try {
			if(conn != null && !conn.isClosed()) conn.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(rs != null && !rs.isClosed()) rs.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch blocks
			e.printStackTrace();
		}
		
		
	}

}

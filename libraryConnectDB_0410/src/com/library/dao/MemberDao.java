package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.library.dao.conn.DBUtill;
import com.library.vo.MemberVo;

public class MemberDao {
//사용자 데이터 관리
	
	public MemberVo login(String id, String pw) {
		
		//매개변수를 물음표(?)로 입력
		String sql = "select * from member where id = ? and pw = ?";
		
		System.out.println("id : "+id);
		System.out.println("pw :" + pw);
		
		try (Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				){
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			ResultSet rs = pstmt.executeQuery();			
			
			
			if(rs.next()) {
				String name = rs.getString("name");
				String adminYN = rs.getString("adminYN");
				
				MemberVo memberVo = new MemberVo(id, "", name, adminYN);
				
				return memberVo;
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		//id/pw 일치하는 사용자 없음
		System.out.println();
		return null;
		}

	//사용자 정보를 데이터 베이스에 등록
	public int insertMember(MemberVo memberVo) {
	
	String sql = "insert into member values ( ?, ?, ?, ?)";
	
	
	try(Connection conn = DBUtill.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			) {
		pstmt.setString(1, memberVo.getId());
		pstmt.setString(2, memberVo.getPw());
		pstmt.setString(3, memberVo.getName());
		pstmt.setString(4, memberVo.getAdminYN());
		
		int res = pstmt.executeUpdate();
		return res;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return 0;
	
	
	}
	
	/**
	 * 데이터 베이스에 등록된 사용자 정보 삭제
	 * statement
	 * 쿼리자체를 String 문자열로 넣어주기 때뮨에
	 * 문자가 값으로 들어가는 경우 ' '넣어줌
	 * 
	 * 
	 * preparedStatement
	 * 향상된 클래스
	 * 코드의 안정성과 가독성 높다
	 * 인자 값으로 전달 가능
	 * 매개변수를 ? 로 설정하고 (?에 홑따옴표 안함)
	 * setString(index, 값);
	 * 
	 * 
	 * @param id
	 * @return
	 */
	
	
	
	
	
	
	
	
	//데이터 베이스에 등록된 사용자 삭제
	public int deleteMember(String id) {
		
		String sql = "delete from book where id =?";
		
		try(Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				) {
			
			pstmt.setString(1, id);
			
			int res = pstmt.executeUpdate();
			return res;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

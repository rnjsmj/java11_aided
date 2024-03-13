package org.kh.db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam1 { //SELECT

	public static void main(String[] args) throws SQLException {
		Connection con = null; //연결
		PreparedStatement pstmt = null; //상태 변경, SQL문 실행
		ResultSet rs = null; //결과(select문) 받아오는 역할
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		
		List<Student> stList = new ArrayList<>();
		
		try {
			Class.forName(driver); //해당 클래스에 드라이버를 이름으로 가져옴
			try {
				con = DriverManager.getConnection(url, userid, userpw); //db 물리적 연결
				pstmt = con.prepareStatement("select * from student"); //논리적 연결
				rs = pstmt.executeQuery(); //commit 명령 포함 x
				
				while(rs.next()) {
					Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point"));
					stList.add(st);
				}
			} catch (SQLException e) {
				System.out.println("DB 연결 실패 또는 SQL 구문 오류");
				e.printStackTrace();
			} 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} finally {
			/*
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
			//** close check하기
			if (rs != null) {   
				rs.close();  /////** throws SQLException 추가
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
			
		
		}
		
		for (Student s : stList) {
			System.out.println(s.toString());
		}
	}

}

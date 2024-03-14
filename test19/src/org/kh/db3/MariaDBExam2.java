package org.kh.db3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kh.db2.Student;

public class MariaDBExam2 {

	public static void main(String[] args) {
		Student newSt = new Student(6, "hotsix", 95);
		Connection con = null; //연결
		PreparedStatement pstmt = null; //상태 변경, SQL문 실행
		//ResultSet rs = null; //결과(select문) 받아오는 역할
		
		String driver = "org.mariadb.jdbc.Driver"; //mariaDB Driver
		String url = "jdbc:mariadb://localhost:3308/temp"; //localhost:3308/{table}
		String userid = "root";
		String userpw = "1234";
		String sql = "insert into student values(?, ?, ?)";
		
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw); 
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, newSt.getNo());
				pstmt.setString(2,  newSt.getName());
				pstmt.setInt(3, newSt.getPoint());
				int i = pstmt.executeUpdate();
				
				if (i>0) {
					System.out.println("mariaDB :" + i + "건 INSERT");
				} else {
					System.out.println("SQL 처리 실패");
				}
				
			} catch (SQLException e) {
				System.out.println("DB 연결 실패 또는 SQL 구문 오류");
				e.printStackTrace();
			} 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
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
			}
		}
		
	}

}

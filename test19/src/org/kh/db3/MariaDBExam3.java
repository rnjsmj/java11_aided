package org.kh.db3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kh.db2.Student;

public class MariaDBExam3 {

	public static void main(String[] args) {
		
		Connection con = null; //연결
		PreparedStatement pstmt = null; //상태 변경, SQL문 실행
		//ResultSet rs = null; //결과(select문) 받아오는 역할
		
		String driver = "org.mariadb.jdbc.Driver"; //mariaDB Driver
		String url = "jdbc:mariadb://localhost:3308/temp"; //localhost:3308/{table}
		String userid = "root";
		String userpw = "1234";
		String sql = "update student set name=?, point=? where no=?";
		
		Student updSt = new Student(3, "cheese burger", 88);
		
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw); 
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, updSt.getName());
				pstmt.setInt(2,  updSt.getPoint());
				pstmt.setInt(3, updSt.getNo());
				int i = pstmt.executeUpdate();
				
				if (i>0) {
					System.out.println("mariaDB :" + i + "건 UPDATE");
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

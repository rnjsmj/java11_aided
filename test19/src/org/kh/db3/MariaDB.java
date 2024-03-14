package org.kh.db3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MariaDB {
	Connection con = null;
	PreparedStatement pstmt = null; 
	ResultSet rs = null; 
	
	String driver = "org.mariadb.jdbc.Driver";
	String url = "jdbc:mariadb://localhost:3308/temp"; 
	String userid = "root";
	String userpw = "1234";
	
	
	// 연결
	public Connection connect()  { 
		//Connection 객체 반환
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	// 연결 해제 (delete, insert, update 경우)
	public void close(PreparedStatement pstmt, Connection con)  {
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
	
	// 연결 해제 (select 경우)
	public void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
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
		}
	}
}

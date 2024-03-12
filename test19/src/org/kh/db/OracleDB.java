package org.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleDB {
	String driver = "oracle.jdbc.driver.OracleDriver"; //ojdbc8.jar
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "system";
	String userpw = "1234";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public Connection connect() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userid, userpw); 
			//conn( 연결) -> pstmt(전원 ON) -> rs(실행)
//			String sql = ""; //필요한 명령어 전달
//			pstmt = conn.prepareStatement(sql);
		} catch( Exception e ) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void close (Connection conn, PreparedStatement pstmt) {
		try {
			if (pstmt != null) {
				pstmt.close();
			}if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}if (pstmt != null) {
				pstmt.close();
			}if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
}

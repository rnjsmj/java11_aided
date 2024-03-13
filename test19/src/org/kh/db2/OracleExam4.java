package org.kh.db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleExam4 { //DELETE

	public static void main(String[] args) throws SQLException{
		Connection con = null; 
		PreparedStatement pstmt = null; 
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		
		String sql = "delete from student where no=?";
		Student st = new Student(6, "insert", 70);
		int i = 0;
		
		try {
			Class.forName(driver);
			
			try {
				con = DriverManager.getConnection(url, userid, userpw); //db 물리적 연결
				pstmt = con.prepareStatement(sql); //논리적 연결
				pstmt.setInt(1, st.getNo());
				i = pstmt.executeUpdate(); // sql 실행 및 결과 반환(commit 명령 포함 o)
				
				if (i>0) {
					System.out.println(i + "건이 성공적으로 처리되었습니다.");
				} else {
					System.out.println("SQL 처리 실패");
				}
				
			} catch (SQLException e) {
				System.out.println("DB 연결 실패 또는 SQL 처리 오류");
				e.printStackTrace();
			} 
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		
	}

}

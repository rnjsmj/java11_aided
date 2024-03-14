package org.kh.db3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.kh.db2.Student;

public class MariaDBExam2_1 {

	public static void main(String[] args) { //Statement 사용 예
		Student newSt = new Student(7, "coke", 98);
		
		Connection con = null; //연결
		Statement stmt = null; //**** 전원 - 명령 전달
		
		String driver = "org.mariadb.jdbc.Driver"; //mariaDB Driver
		String url = "jdbc:mariadb://localhost:3308/temp"; //localhost:3308/{table}
		String userid = "root";
		String userpw = "1234";
		//String sql = "insert into student values(?, ?, ?)"; //Statement => ? 사용 불가
		String sql = "insert into student values(" + newSt.getNo() + ", '"+ newSt.getName() + "' ,"+ newSt.getPoint() + ")";
		
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw); 
				stmt = con.createStatement(); //***
				int i = stmt.executeUpdate(sql); //***
				
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
			
			if (stmt != null) {
				try {
					stmt.close();
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

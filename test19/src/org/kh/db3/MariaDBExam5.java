package org.kh.db3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.kh.db2.Student;

public class MariaDBExam5 {

	public static void main(String[] args) {
		MariaDB maria = new MariaDB();
		
		//select
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from student";
		List <Student> stList = new ArrayList<>();
		
		try {
			con = maria.connect();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point"));
				stList.add(st);
			}
		} catch (SQLException e){
			System.out.println("DB 연결 실패 또는 SQL 구문 오류");
		} finally {
			maria.close(rs, pstmt, con);
		}
		
		for (Student s :  stList) {
			System.out.println(s.toString());
		}
		
		/*
		//insert
		con = null;
		pstmt = null;
		Student st2 = new Student(8, "추가1", 44);
		sql ="insert into student values(?, ?, ?)";
		int i = 0;
		
		try {
			con = maria.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, st2.getNo());
			pstmt.setString(2, st2.getName());
			pstmt.setInt(3, st2.getPoint());
			i = pstmt.executeUpdate();
			
			if (i>0) {
				System.out.println("insert : " + i + "건이 성공적으로 처리되었습니다.");
			} else {
				System.out.println("SQL 처리 실패");
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류");
		} finally {
			maria.close(pstmt, con);
		}
		*/
		
		int i = 0;
		//update
		con = null;
		pstmt = null;
		Student st3 = new Student(3, "수정", 38);
		sql ="update student set name=?, point=? where no=?";
		
		try {
			con = maria.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, st3.getName());
			pstmt.setInt(2, st3.getPoint());
			pstmt.setInt(3, st3.getNo());
			i = pstmt.executeUpdate();
			
			if (i>0) {
				System.out.println("update : " + i + "건이 성공적으로 처리되었습니다.");
			} else {
				System.out.println("SQL 처리 실패");
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류");
		} finally {
			maria.close(pstmt, con);
		}
		
		/*
		//delete
		con = null;
		pstmt = null;
		Student st4 = new Student(1, "기본1", 60);
		sql ="delete from student where name=?";
		
		try {
			con = maria.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, st4.getName());
			i = pstmt.executeUpdate();
			
			if (i>0) {
				System.out.println("delete : " + i + "건이 성공적으로 처리되었습니다.");
			} else {
				System.out.println("SQL 처리 실패");
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류");
		} finally {
			maria.close(pstmt, con);
		}
		*/
	}

}

package org.kh.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class Student {
	private int no;
	private String name;
	private int point;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public Student(int no, String name, int point) {
		super();
		this.no = no;
		this.name = name;
		this.point = point;
	}
	
	public Student() {}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", point=" + point + "]";
	}
	
	
}

public class OracleExam {
	
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //ResultSet ; select문의 결과 받아옴
		
		OracleDB oracle1 = new OracleDB();
		con = oracle1.connect(); //Connection -> Oracle 연결
		String sql = "select * from tmp1"; //java => sql문에 ; 없음
		pstmt = con.prepareStatement(sql); //전원 on
		rs = pstmt.executeQuery(); //sql문 실행
		
		List<Student> stList = new ArrayList<>();
		
		while(rs.next()) {	//rs.getInt(field index) 도 가능
			Student st = new Student(rs.getInt(1), rs.getString(2), rs.getInt(3));
			stList.add(st);
		}
		
		oracle1.close(con, pstmt, rs);
		
		for (Student s : stList) {
			System.out.println(s.toString());
		}
		
		
		
	}

}

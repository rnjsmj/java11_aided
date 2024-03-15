package org.kh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import section.Member;


public class MemberExam {
	Scanner scan = new Scanner(System.in);
	List<Member> list = new ArrayList<>();

	public static void main(String[] args) {
		//int mcode, String id, String pw, String name, int year,String tel
		MemberExam app = new MemberExam();
		app.mainCall();
	}
	
	public void mainCall() {
		//1. 회원가입, 2. 회원목록, 3. 회원삭제, 4. 프로그램 종료
		boolean sw = true;
    	while (sw) {
    		System.out.println("=== 메뉴 ===");
			System.out.println("1. 회원가입");
			System.out.println("2. 회원목록");
			System.out.println("3. 회원삭제");
			System.out.println("4. 프로그램 종료");
			
			System.out.print("번호 선택  : ");
    		
    		switch(scan.nextInt()) {
    			case 1: join(); break;
    			case 2: list(); break;
    			case 3: remove(); break;
    			case 4: sw = false; break;
    			default : sw = false;
    		}
    	}
    }
    
    public void join() {
    	System.out.print("ID 입력 : ");
		String id = scan.next();
		System.out.print("비밀번호 입력 : ");
		String pw = scan.next();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("나이 입력 : ");
		int year = scan.nextInt();
		System.out.print("전화번호 입력 : ");
		String tel = scan.next();
		list.add(new Member(list.size()+1, id, pw, name, year, tel));
		System.out.println("회원 가입 성공");
    }
    public void list() {
    	for (Member m : list) {
			System.out.println(m.toString());
		}
    }
    public void remove() {
    	System.out.print("삭제할 회원 : ");
		String id = scan.next();
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				System.out.println(list.get(i).toString() + "가 삭제되었습니다.");
				list.remove(i);
			}
		}
		
    }

}

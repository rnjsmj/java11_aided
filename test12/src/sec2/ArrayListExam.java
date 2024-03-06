package sec2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
	//add, remove, contains, isEmpty, size, get, 
	public static void main(String[] args) {
		List<Member> memList = new ArrayList<>();
		
		for (int i=1; i<=10; i++) {
			Member mem = new Member(i, "ident"+i, "pass"+i+i, "회원"+i, 0);
			memList.add(mem);
		}
		
		Member mem = new Member(11, "kwon", "1234", "권민지", 0);
		
		memList.add(mem);
		
		for (Member m : memList) { //순회 1
			System.out.println(m.toString());
		}
		for (int i=0; i<memList.size(); i++) { //순회2
			System.out.println(memList.get(i));
		}
		
		
		memList.remove(3); //인덱스 3
		System.out.println("***************");
		Member tmp = new Member(11, "kwon", "1234", "권민지", 0);
		//System.out.println(memList.contains(tmp));
		
		System.out.println("***************");
		for (Member m : memList) { 
			System.out.println(m.toString());
		}
		
		System.out.println();
		List<Member> memList2 = new ArrayList<>();
		if(memList2.isEmpty()) {
			System.out.println("비어있는 리스트입니다.");
		} else {
			System.out.println("내용이 있는 리스트입니다.");
		}
		
		
		
		System.out.println();
		List<String> names = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			names.add("이름"+i);
		}
		
		names.remove(2);
		
		if(names.contains("이름3")) {
			System.out.println("데이터가 존재합니다.");
		} else {
			System.out.println("데이터가 존재하지 않습니다.");
			names.add("이름3");
		}
		
		for(String s:names) {
			System.out.println(s);
		}
		System.out.println();
		
		
		
		//names.clear();
		if(names.isEmpty()) {
			System.out.println("비어있는 리스트입니다.");
		} else {
			System.out.println("내용이 있는 리스트입니다.");
			for(String s:names) {
			System.out.println(s);
			}
		}
		
		
		
		
	}

}

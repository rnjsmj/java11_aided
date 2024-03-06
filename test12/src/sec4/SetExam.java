package sec4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {

	public static void main(String[] args) {
		// Set : 값만 저장, 중복 허용 x, 순서 유지 x
		//선언 및 생성
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new TreeSet<Integer>();
		
		//6개 추가
		set1.add("야구");
		set1.add("축구");
		set1.add("배구");
		set1.add("농구");
		set1.add("피구");
		set1.add("야구");
		
		System.out.println("set1 요소의 수 : " + set1.size()); // >>> 중복 제외한 5개
		System.out.println(set1);
		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 입력 : ");
		String sports = sc.next();
		
		
		if (set1.contains(sports)) {
			System.out.println("\n해당 이름이 존재합니다.");
		} else {
			set1.add(sports);
			System.out.println("\n" + sports + "이(가) 입력되었습니다.");
			System.out.println(set1);
		}
		*/
		
		//요소 삭제
		set1.remove("피구");
		System.out.println(set1);
		
		//비우기
		set1.clear();
		System.out.println(set1);
		
		
		
		System.out.println();
		if(set2.isEmpty()) {
			System.out.println("set2가 비어있습니다.");
		} else {
			System.out.println("set2 요소의 수 : " + set2.size()); 
		}
		
		
		
		System.out.println();
		Set<Integer> set3 = new TreeSet<Integer>(Arrays.asList(9, 3, 4, 6, 8, 7, 6));
		System.out.println(set3);
		
		
		//Set 순회 1(향상된 for문)
		for (Integer i : set3) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		//Set 순회 2 (Iterator)
		Iterator it = set3.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}

	}

}

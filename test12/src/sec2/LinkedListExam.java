package sec2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		List<Student> sList = new LinkedList<>();
		
		Student s1 = new Student();
		s1.setNo(1);
		s1.setName("학생1");
		s1.setPoint(80);
		sList.add(s1);
		
		Student s2 = new Student(2, "학생2", 100);
		sList.add(s2);

		sList.add(new Student(3, "학생3", 70));
		
		System.out.println("번호\t이름\t점수");
		for(Student s : sList) {
			System.out.printf("%s\t%s\t%s\n", s.getNo(), s.getName(), s.getPoint());
		}
		
		//sList.set(3, new Student(4, "학생4", 90));
		// >>> 범위벗어남
		sList.add(new Student()); 
		sList.set(3, new Student(4, "학생4", 90));
		
		System.out.println();
		System.out.println("번호\t이름\t점수");
		for(Student s : sList) {
			System.out.printf("%s\t%s\t%s\n", s.getNo(), s.getName(), s.getPoint());
		}
	}

}

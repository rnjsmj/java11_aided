package org.kh.java;

public class Variable4 {
	public static void main(String[] args) {
		//출력 형식
		
		String name = "권민지";
		short age = 24;
		float height = 161.7f;
		double weight = 65.0;
		char init = 'k';
		
		/*
		 * 이스케이프 문자 (모든 print문 사용 가능)
		 * \n : 줄바꿈
		 * \t : Tab
		 * \\ : '\' 출력
		 * \" or \' : 따옴표 출력
		 */
		
		String name2 = "\'권민지\'";
		System.out.println("이름 : "+ name2);
		System.out.println("이름 : \"" +name+ "\"");
		
		System.out.printf("%n이름 : \" %s \"", name);
		System.out.printf("%n나이 : %d", age);
		System.out.printf("%n키 : %f", height);
		System.out.printf("%n체중 : %.3f", weight);
		System.out.println("\n이니셜 : "+ init);
	}
}

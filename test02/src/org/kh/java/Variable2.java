package org.kh.java;

public class Variable2 {
	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i; //초기화 하지 않고 출력할 경우 Null Pointer Error
		long l;
		
		i = 30; //초기화 
		l = 40L; //long 타입 고정
		
		System.out.println("b="+b);
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
	}
}

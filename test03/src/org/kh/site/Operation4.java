package org.kh.site;
//증감연산
public class Operation4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println("전위 증가 연산 : " + (++a));
		System.out.println("후위 증가 연산 : " + (b++));
		System.out.println("전위 감소 연산 : " + (--a));
		System.out.println("전위 증가 연산 : " + (b--));
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
	}
}

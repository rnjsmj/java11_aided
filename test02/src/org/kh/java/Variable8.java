package org.kh.java;

public class Variable8 {
	public static void main(String[] args) {
		//가변할당 (동적할당) : 자료형과 무관하게 해당하는 리터럴(값)에 의해 자료형 변형
		var num1 = 28.356;
		var num2 = 34;
		var num3 = 'k';
		var num4 = "권민지";
		var num5 = true;
		num1 = 67; //타입 변환
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		System.out.println("num5 : " + num5);
	}
}

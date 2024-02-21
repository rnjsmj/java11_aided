package org.kh.site;

//명령(연산) => Operation(OpCode + Operand)
public class Operation1 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = !b1;
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		
		int i1=20, i2=40;
		int i3 = i1 + i2; 
		System.out.println("i3 : " + i3);
		
		int max = (i1 > i2) ? i1 : i2; //조건문 참일 경우 max = i1, 거짓일 경우 max = i2
		System.out.println("max : " + max);
	}

}

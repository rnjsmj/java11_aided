package org.kh.java;

public class Variable1 {

	public static void main(String[] args) {
		boolean a = true; 	//논리형(true, false) : 1byte
		//byte b = 255; 	// Overflow
		//byte b = -129;	//Underflow
		byte b = 126; 		//1byte : -128 ~ 127 =>
		short c = 32767; 	//2byte : -32768 ~ 32767
		char d = 'k';		//2byte
		int e = 234567;		//4byte
		float f = 3.14f;	//4byte
		long g = 23456789; 	//8byte
		double h = 3.14; 	//8byte (뒤에 d => double 고정)
		
		System.out.println("byte : " + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("short : " + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("char : " + Character.MIN_VALUE + "~" + Character.MAX_VALUE);
		System.out.println("int : " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("float : " + Float.MIN_VALUE + "~" + Float.MAX_VALUE);
		System.out.println("long : " + Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		System.out.println("double : " + Double.MIN_VALUE + "~" + Double.MAX_VALUE);
		
	}

}

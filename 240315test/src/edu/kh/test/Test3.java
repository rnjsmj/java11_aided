package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
//		List<Integer> list = null; //
		List<Integer> list = new ArrayList<>(); 
		
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		//list.add(1.23456); //
		
		for(int num : list) {
			char ch;
			
			if (num <= 0) {
				ch = '-';
			} else if (num > 0) {
				ch = '+';
			} else {
				System.out.println("@@@@@@@@@@");
				continue;
			}
			
			// Math.abs() : 절대값
			for (int i=1; i<Math.abs(num); i++) {
				System.out.println(ch);
			}
			System.out.println();
		}
		
	}

}

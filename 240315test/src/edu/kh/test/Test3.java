package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	//양수 또는 음수 => 절대값의 크기만큼 반복하며 문자 출력 (각 부호에 맞게)
	//0 => @@@@@@@@@@ 출력

	public static void main(String[] args) {
//		List<Integer> list = null;
		//list를 선언한 List는 인터페이스이므로 객체를 생성할 수 없음
		//ArrayList로 생성해야 하지만, null로 대입하였으므로 
		//요소를 추가하는 코드에서 NullPointException이 발생
		//=> Integer를 포함하는 ArrayList를 생성
		List<Integer> list = new ArrayList<>(); 
		// + 제네릭은 참조형만 가능
		
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
//		list.add(1.23456); 
		//list는 Integer타입의 객체만 포함할 수 있으므로 실수를 추가하면 타입이 맞지 않아 오류 발생
		//=> list.add(1);로 수정하여 정수 값을 list에 저장한다.
		list.add(1);
		
		
		for(int num : list) {
			char ch;
			
//			if (num <= 0) {
			//list에서 꺼낸 요소가 0일 경우에는 '-' 가 아닌 "@@@@@@@@@@"를 출력해야 하므로
			//num값의 조건은 0을 포함하지 않고, 0보다 작아야 한다.
			//=> (num < 0) 으로 if문의 조건을 수정한다.
			if (num < 0) {
				ch = '-';
			} else if (num > 0) {
				ch = '+';
			} else {
				System.out.println("@@@@@@@@@@");
				continue;
			}
			
			// Math.abs() : 절대값
//			for (int i=1; i<Math.abs(num); i++) {
			// for문의 초기값이 int i=1인 경우 1부터, i가 절대값보다 작은 경우까지만 반복하므로
			// 절대값의 크기보다 1번 적게 반복을 수행한다.
			// => 초기값의 조건을 int i=0;으로 수정하거나, 조건문을 i<=Math.abs(num)으로 수정하여
			//	  절대값의 크기만큼 반복을 수행하도록 한다.
			for (int i=0; i<Math.abs(num); i++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}

}

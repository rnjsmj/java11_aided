package com.kh.test4;

import com.kh.test4.model.Person;

public class Application {

	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
		/* 배열 객체 생성 안한 경우
		//12번 줄
		//Person 클래스 객체가 들어가는 배열을 생성했지만
		//배열에 들어갈 Person 객체를 생성하지 않아
		//12번에서 배열의 객체 요소에 접근하면 NullPointerException이 발생한다.
		// => 9번에서 Person 객체 배열 생성 후 비어있는 pArr 배열에
		//	  Person 클래스 객체를 생성하여 (0~2에) 대입한다.
		 */
		//Person의 배열요소인 pArr 객체가 초기화(값 대입)되지 않아
		//NullPointerException이 발생한다.
		// => 비어있거나 초기화되어있지 않은 pArr 배열에 Person 객체를
		//	생성하여 각 요소에 대입한다.
		// * 주요 예외 : IOException, ClassNotFoundException, RuntimeException,
		//			ArithmeticException, NullPointerException, IndexOutOfBoundsException
		
		
		//객체 생성 예
		pArr[0] = new Person("객체1");
		pArr[1] = new Person("객체2");
		pArr[2] = new Person("객체3");
		
		/* 배열에 객체 생성 가정한 경우
		// 11번에서 반복문을 이용하여 0부터 배열(pArr)의 길이만큼 반복을 수행하기 때문에 
		// 배열의 길이보다 1번 더 많이 반복하여, 4번째 반복을 수행했을 때 
		// ArrayIndexOutOfBounds Exception이 발생한다
		// => 반복문의 조건을 i<pArr.length 로 수정하여 배열(pArr)의 크기만큼
		//    반복하도록 한다.
		 */
		// 실제 선언한 배열의 크기보다 더 많은 수의 반복이 실행되기 때문에
		// ArrayIndexOutOfBoundsException 발생
//		for(int i=0; i <= pArr.length; i++) {
		for(int i=0; i < pArr.length; i++) {
			System.out.println(pArr[i].getName());
		}
	}

}

package com.kh.exam.controller;

import java.util.Arrays;
import java.util.Scanner;

public class TestController {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		String[] personArr = new String[5];
		
		
//		for(int i = 0; i < personArr.length(); i++) { 
		//1) 다음 줄에서 1회 반복의 결과로  "1번째 주민번호 입력 :" 이 입력되어야 하는데
		// i가 0부터 시작하기 때문에 "0번째 주민번호 입력 : "이라고 출력된다.
		//2)
		// 배열의 길이를 구할 때는 length 속성을 사용해야 하는데,
		// 문자열의 길이를 구하는 length()를 사용했기 때문에 오류 발생
		// => for(int i=1; i<=personArr.length; i++) 로 수정하여
		// 배열의 크기만큼 반복을 수행할 수 있도록 한다.
		for(int i = 1; i <= personArr.length; i++) { 
			System.out.print(i + "번째 주민번호 입력 : ");
			String personId = sc.nextLine();
			if((personId.length() == 14)) { 
//				char gender = personId.charAt(8);  
				// 입력된 주민번호에서 성별을 구분할 수 있는 위치는 8번째 위치, 즉 7번 인덱스이므로
				// 해당 인덱스의 문자 값을 가져오는 charAt()에서 8번 인덱스를 가져오도록 하면 안된다.
				// => personId.charAt(7) 으로 수정하여 gender에 대입한다.
				char gender = personId.charAt(7);  
//				if(gender == 1 || gender == 2 || gender == 3 || gender == 4) {
				// gender는 문자형 데이터이므로 정수와 같은지 비교할 경우
				// 잘못된 결과가 반환된다.
				// 조건을 gender == '1' || gender == '2' || gender == '3' || gender == '4'
				// 로 수정하여 해당 문자 데이터의 값이 동일한지 비교한다.
				if(gender == '1' || gender == '2' || gender == '3' || gender == '4') { 
					personArr[i-1] = personId.substring(0, 8) + "******";
				} else {
					System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
					i--;
				}
			} else {
				System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
				i--;
			}
		}
		System.out.println("--- 주민번호 정보 등록 완료 ---");
		System.out.println(Arrays.toString(personArr));
	}
}

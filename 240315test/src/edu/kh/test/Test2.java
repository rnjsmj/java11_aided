package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> nameList = new ArrayList<String>();
		
		while(true) {
			System.out.println("추가할 이름을 입력 : ");
			String name = sc.next();
			
//			if(name == "clear") { 
			//String 비교는 '=='로 수행할 경우 정상적인 수행이 되지 않는다.
			// => name.equals("clear")로 수정하여 갖고있는 문자열 값을 비교할 수 있도록 한다. 
			if(name.equals("clear")) { //*
				//continue;
				// continue를 수행하기 때문에 continue 이후의 코드는 실행되지 않아
				// 20번에서 목록에 저장된 이름을 삭제할 수 없다.
				// => 18번의 continue; 를 19~20번 코드가 실행될 수 있도록 20번 코드의
				//	   뒤로 옮긴다. 
				//   (continue를 옮기지 않고 지우기만 하면  28~33의 if~else문에서 
				//		"clear"를 nameList에 추가하게 된다.)
				System.out.println("이름 목록 초기화");
				nameList.clear();
				continue; //*
			}
			
//			if(name == "exit") {
			//String 비교는 '=='로 수행할 경우 정상적인 수행이 되지 않는다.
			// => name.equals("clear")로 수정하여 갖고있는 문자열 값을 비교할 수 있도록 한다. 
			if(name.equals("exit")) { //*
				System.out.println("==입력 종료==");
				//return; //break;
				// Scanner로 입력된 name이 exit인 경우 return; 을 통해
				// 36~38번의 반복출력 문장을 실행하지 못하고 main 함수 밖으로 나가게 된다.
				// => break; 문을 사용해 13번~34번의 while문을 빠져나간다.
				break; //*
			}
			
			if(nameList.contains(name)) {
				System.out.println("*이미 존재하는 이름");
			} else {
				//
				//입력된 name을 nameList에 추가하는 코드가 없기 때문에 추가할 수 없다.
				nameList.add(name); //*
				System.out.println(name + " 추가 완료");
			}
		}
		
		for (String name : nameList) {
			System.out.println(name);
		}
	}
}

package com.kh.test6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.test6.model.Food;

public class Application extends Food{
	Scanner scan = new Scanner(System.in);
	List<Food> list = new ArrayList<>();

	public static void main(String[] args) {
		/* 캡슐화 x
		//Scanner로 리스트 출력 (while) > 번호에 따른 동작 구현 (if)
		Scanner scan = new Scanner(System.in);
		List<Food> list = new ArrayList<>();
		
		while(true) {
			System.out.println("=== 음식 메뉴 리스트 ===");
			System.out.println("1. 음식 추가");
			System.out.println("2. 음식 정보");
			System.out.println("3. 음식 삭제");
			System.out.println("4. 프로그램 종료");
			
			System.out.print("번호 선택  : ");
			int i = scan.nextInt();
			
			if (i == 1) {
				System.out.print("추가할 음식 입력 : ");
				String name = scan.next();
				System.out.print("칼로리 입력 : ");
				int kcal = scan.nextInt();
				list.add(new Food(name, kcal));
				System.out.println("음식 정보가 추가되었습니다.");
			} else if (i == 2) {
				for (Food f : list) {
					System.out.println(f.toString());
				}
			} else if (i == 3) {
				System.out.print("삭제하고 싶은 음식 선택 : ");
				String name = scan.next();
				
				for (Food f : list) {
					if (f.getName().equals(name)) {
						list.remove(f);
						System.out.println(f.toString() + "가 삭제되었습니다.");
						break;
					}
				}
			} else if(i == 4) {
				break;
			}
			
			
		}*/
		
		//캡슐화 코드
		
		Application app = new Application();
		app.mainMenu();
	}
	
    public void mainMenu() {
    	boolean sw = true;
    	while (sw) {
    		System.out.println("=== 음식 메뉴 리스트 ===");
			System.out.println("1. 음식 추가");
			System.out.println("2. 음식 정보");
			System.out.println("3. 음식 삭제");
			System.out.println("4. 프로그램 종료");
			
			System.out.print("번호 선택  : ");
    		
    		switch(scan.nextInt()) {
    			case 1: add(); break;
    			case 2: info(); break;
    			case 3: remove(); break;
    			case 4: sw = false; break;
    			default : sw = false;
    		}
    	}
    }
    
    public void add() {
    	System.out.print("추가할 음식 입력 : ");
		String name = scan.next();
		System.out.print("칼로리 입력 : ");
		int kcal = scan.nextInt();
		list.add(new Food(name, kcal));
		System.out.println("음식 정보가 추가되었습니다.");
    }
    public void info() {
    	for (Food f : list) {
			System.out.println(f.toString());
		}
    }
    public void remove() {
    	System.out.print("삭제하고 싶은 음식 선택 : ");
		String name = scan.next();
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				System.out.println(list.get(i).toString() + "가 삭제되었습니다.");
				list.remove(i);
			}
		}
		
		//향상된 for문 사용할 경우 remove 하고 나면 index 변화 생겨 다음 순회를 진행할 때 오류가 발생할 수 있음
		// => 일반 for문 사용
	
    }
}

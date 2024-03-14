package com.kh.test5;

import java.util.ArrayList;
import java.util.List;

import com.kh.test5.model.Fruit;

public class Application {

	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
//		list.add("바나나");
		/*
		//list는 Fruit 클래스 객체를 포함하는 ArrayList이므로
		//String 값을 추가하면 타입 오류가 발생한다.
		// => list.add(new Fruit("바나나", "노랑")); 처럼
		//	  Fruit 객체를 생성하여 list에 추가(add)해야 한다.
		 */
		//list(ArrayList)의 제네릭 타입은 Fruit으로 설정되어 있으므로
		//Fruit 객체를 생성하여 요소를 추가해야 하지만
		//String 요소를 추가하여 Type MisMatch Error 발생
		// =>
		list.add(new Fruit("바나나", "노랑"));
		
//		for(int i=0; i < list.length; i++) {
		/*
		//ArrayList의 배열 크기(요소 개수)를 반환할 때는 size()를 사용해야 하는데
		//length를 사용했기 때문에 오류가 발생한다.
		//=> for문의 조건문을 i < list.size()로 수정하여 배열의 크기만큼
		//	반복문을 수행하도록 해야한다.
		 */
		//list(ArrayList) 컬렉션 프레임워크는 length 속성이 없어
		//length로 요소의 수를 구할 수 없기 때문에
		// AttributeNotFound 오류가 발생한다.
		// =>
		for(int i=0; i < list.size(); i++) {
//			System.out.println(list[i].getName());
			//ArrayList에 포함되어있는 특정 개체를 가져올 때는 get()메서드를 사용해야 하는데
			//인덱스만을 사용하여 객체를 반환했기 때문에 오류가 발생한다.
			// => list.get(i)를 사용하여 객체를 가져와야 한다.
			//[index]는 배열 객체에서 활용하는 명령인데,
			//list(ArrayList)에서 배열 요소 참조 연산인 []이 사용되었으므로
			//Not Allowed Operation 오류가 발생한다.
			System.out.println(list.get(i).getName());
		}
		
	}

}

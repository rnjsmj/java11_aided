package sec2;

import java.util.ArrayList;
import java.util.List;

//컬렉션 프레임워크 : 자바에서 기본적으로 제공하는 여러데이터를 저장,관리하기 위해 미리 준비해놓은 자료구조
//Map, Set, List.... ==> 컬렉션 프레임워크의 기본은 모두 제네릭의 일종
public class CollectionExam1 {

	public static void main(String[] args) {
		// ****(interface) : (class)****
		// List : ArrayList, Vector, LinkedList 
		// Set  : HashSet, TreeSet 
		// Map : HashMap, HashTable, TreeMap, Properties
		//   ㄴ Key와 Value
		// Stack, Queue, Deque 등 ...
		
		//자료구조인 컬렉션 프레임워크에서 자주 사용하는 메서드
		//add() : 인스턴스 추가
		//clear() : 모든 인스턴스 제거
		//remove() : 특정 인스턴스 제거 (index)
		//size() : 인스턴스 개수 반환
		//iterator() : 분리자(반복자) => 해당 컬렉션을 분리
		
		//interface로 선언하면 필요한 클래스(ArrayList, Vecter 등..)으로 사용 가능
		List<String> lst = new ArrayList<String>();
		lst.add("권민지");
		lst.add("박윤서");
		lst.add("송예빈");
		lst.add("이우영");
		for(String s : lst) {
			System.out.println(s);
		}
	}

}

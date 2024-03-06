package sec3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		Map map0 = new TreeMap<>();
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		TreeMap<Integer, String> map2 = new TreeMap<>();
		TreeMap<Integer, String> map3 = new TreeMap<>(map1);
		TreeMap<Integer, String> map4 = new TreeMap<> () {{
			put(1, "권민지");
		}};
		
		//요소 추가
		map2.put(1, "권민지");
		map2.put(2, "손흥민");
		map2.put(3, "박주영");
		map2.put(4, "차두리");
		map2.put(5, "차범근");
		
		//요소 제거
		map2.remove(4);
		
		//순회 출력
		for (Integer i : map2.keySet()) {
			System.out.println(i + " : " + map2.get(i));
		}
		
		System.out.println("map2 : " + map2);
		System.out.println("map2에서 키가 5인 요소 : " + map2.get(5));
		System.out.println("map2의 첫 엔트리 : " + map2.firstEntry());
		System.out.println("map2의 첫 키 : " + map2.firstKey());
		System.out.println("map2의 마지막 첫 엔트리 : " + map2.lastEntry());
		System.out.println("map2의 마지막 키 : " + map2.lastKey());

	}

}

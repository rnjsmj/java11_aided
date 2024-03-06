package sec3;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {
	public static void main(String[] args) {
		//선언방법
		Map<String, String> map0 = new HashMap<String, String>(); //Map 인터페이스를 활용한 HashMap 생서
		Map<String, String> map1 = new HashMap<String, String>(); //HashMap 선언 및 생성 표준식
		Map<String, String> map2 = new HashMap<>(); 			  //생성자에 인자 생략
		Map<String, String> map3 = new HashMap<>(map1);			  //맵의 복제
		
		//초기용량 지정보다 더 많은 데이터를 저장하게 되면 자동적으로 초기용량의 배가 됨
		HashMap<String, String> map4 = new HashMap<>(10); //초기용량지정(capacity)
		HashMap<String, String> map5 = new HashMap<>(10, 0.7f); //load factor - 사용확률 지정
		HashMap<String, String> map6 = new HashMap<>() {{
			put("name", "권민지");
		}}; //

		HashMap<Integer, String> fruits = new HashMap<>();
		//요소 추가
		fruits.put(1, "딸기");
		fruits.put(2, "키위");
		fruits.put(3, "망고");
		fruits.put(4, "귤");
		fruits.put(5, "청포도");
		fruits.put(6, "복숭아");
		fruits.put(7, "파인애플");
		
		System.out.println("변경 전");
		System.out.println(fruits);
		
		//요소 제거
		fruits.remove(4); //map은 index가 아닌 key
		System.out.println("변경 후");
		System.out.println(fruits);
		
		//순회
		System.out.println("keySet을 이용한 순회");
		for (Integer i : fruits.keySet()) {
			System.out.println(i + " : " + fruits.get(i));
		}
		
		//포함하는 값 확인
		if (fruits.containsValue("키위")) {
			System.out.println("해당 HashMap에 키위가 존재합니다.");
		} else {
			System.out.println("해당 HashMap에 키위가 존재하지 않아 추가합니다.");
			fruits.put(8, "키위");
		}
		
		
	}
}

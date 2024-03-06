package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class MapExam {

	public static void main(String[] args) {
		// *** map ***
		//Map은 index 존재 x => key 이용, 순서유지 x
		//키와 값 분리 시 entry 또는 element 단위로 Iterator나 Enumeration 필요
		
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new Hashtable<>();
		Map<Integer, String> map3 = new TreeMap<>();
		Properties map4 = new Properties();
		
		map1.put("kim", 90); //put() 데이터 추가
		map1.put("lee", 100);
		map1.put("park", 80);
		map1.put("choi", 70);
		map1.put("kwon", 90);
		
		System.out.println(map1);
		
		
		System.out.println("park : " + map1.get("park")); 
		//개별 요소 접근 시 key 사용 (key에 해당하는 value 반환)
		
		if(map1.containsKey("kwon")) {
			System.out.println("kwon : " + map1.get("kwon"));
		} else {
			System.out.println("키가 kwon인 요소 존재하지 않음");
		}
		
		if(map1.containsValue(100)) {
			System.out.println("만점자 존재");
		} else {
			System.out.println("만점자 존재 x");
		}
		
		System.out.println();
		//map 순회 1 <= Iterator (분리자)
		Iterator<String> keys = map1.keySet().iterator();
		//keys => {kim, lee, park, choi, kwon}
		while(keys.hasNext()) { //다음 데이터가 존재할 경우
			String key = keys.next();
			System.out.println(key  + "=" + map1.get(key));
		}
		System.out.println();
		//map 순회 2 <= entrySet (키, 값 쌍)
		for (Map.Entry<String, Integer> entry : map1.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		System.out.println();
		//map 순회 3 <= keySet 
		for (String key : map1.keySet()) {
			System.out.println(key + "=" + map1.get(key));
		}
		
		
		
		
		//************* hashtable
		//key는 중복 불가
		map2.put("김", "1코스");
		map2.put("이", "2코스");
		map2.put("박", "3코스");
		map2.put("최", "1코스");
		map2.put("김", "2코스");
		map2.put("박", "1코스");
		System.out.println(map2);
		// >>> 중복 불가능하기 때문에 키가 같은 경우 해당 키의 값은 나중에 넣은 값으로 정의됨
		
		map2.remove("김");
		System.out.println(map2);
		map2.clear();
		System.out.println(map2);
		
		
		
		
		//************** TreeMap
		String[] names = {"1","2","3","4","5","6","7","8","9"};
		for (int i=0; i<9; i++) {
			map3.put(i, names[i]);
		}
		
		System.out.println("\n인원수 : " + map3.size());
		for (Integer i : map3.keySet()) {
			int key = i;
			String value = map3.get(key);
			System.out.println( key + " : " + value);
		}
		
		
		//*************** Properties
		//Properties의 키와 값은 모두 문자열로 취급
		map4.setProperty("name", "권민지");
		map4.setProperty("age", "24");
		System.out.println("이름 : " + map4.getProperty("name"));
		
		
	}

}

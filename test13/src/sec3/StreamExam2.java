package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExam2 {

	//String 타입의 List Stream 방식 활용
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("햄식이");
		lst.add("햄순이");
		lst.add("햄자");
		lst.add("햄이");
		lst.add("햄군");
		lst.add("햄미");
		//직렬로 연결된 연속 데이터로 만들어야 함 => stream화
		//ArrayList의 Stream화
		Stream<String> stream = lst.stream();
		stream.forEach(n -> System.out.println(n));
		/* ==
		for (String t : lst) {
			System.out.println(t);
		}*/
		
		//정렬
		System.out.println("\n정렬 후");
		lst.stream().sorted().forEach(n -> System.out.println(n));
		
		//요소의 수
		int cnt = (int) lst.stream().count();
		System.out.println("\n요소의 수 : " + cnt);
	}

}

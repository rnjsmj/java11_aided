package sec4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {

	public static void main(String[] args) {
		//Queue : FIFO (선입선출)
		//자바에서는 Queue가 interface 이므로, 같은 구조를 가진 LinkedList 이용
		Queue<String> q = new LinkedList<>();
		
		//추가
		q.offer("햄스터");
		q.offer("개");
		q.offer("고양이");
		q.offer("고슴도치");
		q.offer("이구아나");
		q.offer("도마뱀");
		
		System.out.println("q : " + q);
		System.out.println("peek() : " + q.peek()); //선입선출이므로 가장 먼저 추가한 것을 반환
		System.out.println("q : " + q);
		System.out.println("poll() : " + q.poll()); //첫 데이터 반환 후 제거
		System.out.println("q : " + q);
		System.out.println("poll() : " + q.poll()); 
		System.out.println("q : " + q);
		

	}

}

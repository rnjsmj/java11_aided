package sec4;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExam {

	public static void main(String[] args) {
		// Deque : LIFO와 FIFO가 모두 가능한 구조
		// => Stack 과 Queue의 혼합구조로, 양쪽에서 입출력이 모두 가능
		
		Deque<String> d = new LinkedList<>();
		
		//추가
		d.addFirst("자바");
		d.addFirst("파이썬");
		d.addLast("자바스크립트");
		d.addFirst("리액트");
		d.addLast("노드");
		d.addLast("스타일시트");
		
		System.out.println("d : " + d);
		
		System.out.println("peek() : " + d.peek()); //queue의 peek()
		System.out.println("peekLast() : " + d.peekLast()); //stack의 peek()
		System.out.println("peekFirst() : " + d.peekFirst()); //== peek()
		System.out.println("d : " + d);
		
		System.out.println("poll() : " + d.poll());
		System.out.println("d : " + d);
		System.out.println("pollLast() : " + d.pollLast()); //stack의 pop()
		System.out.println("d : " + d);
		System.out.println("pollFirst() : " + d.pollFirst()); //== poll()
		System.out.println("d : " + d);
		
		System.out.println("pop() : " + d.pop()); //==poll() * //stack의 pop과 반대
		System.out.println("d : " + d);
		
		
		

	}

}

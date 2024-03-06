package sec4;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		//stack : LIFO(후입선출)
		//top : 스택의 가장 위 
		//peek : top 반환(조회)
		//pop : top 반환 후 제거
		
		Stack<String> stack = new Stack();
		
		stack.push("사과");
		stack.push("복숭아");
		stack.push("샤머");
		stack.push("키위");
		stack.push("파인애플");
		stack.push("리치");
		
		System.out.println("stack : " + stack);
		System.out.println("peek() : " + stack.peek());
		System.out.println("stack : " + stack);
		System.out.println("pop() : " + stack.pop());
		System.out.println("stack : " + stack);
		System.out.println("pop() : " + stack.pop());
		System.out.println("stack : " + stack);

	}

}

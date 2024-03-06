package sec2;

public class CharStack {
	private StringBuffer stack;
	public CharStack(int capacity) {
		stack = new StringBuffer(capacity);
	}
	
	public CharStack() {
		stack = new StringBuffer();
	}
	
	public void push(char c) { //한글자씩 저장
		stack = stack.append(c);
	}
	
	public int pop() { //한글자씩 가져오기
		char ch = stack.charAt(stack.length()-1); //맨 마지막 인덱스
		stack = stack.deleteCharAt(stack.length()-1);
		return ch;
	}
	
	public char[] list() { //문자열을 문자배열로 변경
		char[] arr = stack.substring(0).toCharArray();
		return arr;
	}
	
	public String toString() { //문자배열을 문자열로 변경
		return this.stack.toString();
	}
	
}

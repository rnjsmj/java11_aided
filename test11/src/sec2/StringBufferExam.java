package sec2;

public class StringBufferExam {

	public static void main(String[] args) {
		String str = new String("Java Programmer");
		str += " Junier Level";
		str += " Develope";
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer();	//스택 구조
		byte[] b = str.getBytes();
		for (byte c : b) {
			char k = (char) c;
			sb.append(k);
		}
		System.out.println(sb);
		
		
		//CharStack 클래스 이용
		CharStack cs = new CharStack();
		cs.push('V');
		cs.push('I');
		cs.push('C');
		cs.push('T');
		cs.push('O');
		cs.push('R');
		cs.push('Y');
		
		System.out.println(cs.list());	//문자배열	
		System.out.println("문자열 : " +cs.toString() + ", 글자수 : " + cs.toString().length() );
		//문자배열의 length는 속성이지만 문자열의 length()는 메서드
		
		System.out.println((char) cs.pop());
		System.out.println((char) cs.pop());
		System.out.println((char) cs.pop());
		System.out.println("pop() 후 글자수 : " + cs.toString().length());
	}

}

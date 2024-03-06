package sec1;

public class Exam1 {

	public static void main(String[] args) {
		int a = 1004;
		int b = 1004;
		
		System.out.println("a==b : " + (a==b)); //true : 기본형 정수 값 비교 (주소 달라도 true)
		
		String s1 = "문자열"; 
		String s2 = "문자열";
		//String : 기본형도 참조형도 아님 => ==, equals() 둘다 가능하지만
		//Collection Framework 사용 시 == 연산자는 사용할 수 없음
		//=> equals() 를 사용하는 것이 맞음 (String 클래스 연산)
		System.out.println("s1==s2 : " + (s1==s2)); //true : 문자열의 값 비교 (X)
		System.out.println("s1 equals s2 : " + (s1.equals(s2))); //true (O)
		
		Integer c = new Integer(1004);
		Integer d = new Integer(1004);
		System.out.println("a==c : " + (a==c)); //true
		System.out.println("c==d : " + (c==d)); //false
		// 기본형과 참조형의 비교는 값 비교
		// 참조형과 참조형의 비교는 주소 비교
		
		// 참조형끼리의 비교는 equals() 사용
		System.out.println("c equals d : " + (c.equals(d))); //true
		
	}

}

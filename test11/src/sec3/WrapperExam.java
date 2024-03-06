package sec3;

public class WrapperExam {

	public static void main(String[] args) {
		//int a; //기본형 => 값을 초기화 하지 않으면 메모리에 담을 수 없음 (Integer도 마찬가지)
		//System.out.println("a=" + a);

		int a = 10;
		Integer b = a; //참조형에 기본형 데이터 대입 => Wrapping, Boxing
		int c = b; //기본형에 참조형 데이터 대입 => UnWrap, UnBoxing
		// Boxing : 기본형은 멤버를 가질 수 없으므로 해당 타입의 메서드나 필드가 없기 때문에
		//			참조형으로 변경하여야 해당 타입의 정보를 확인하고, 메서드를 사용할 수 있으므로
		//			필요에 따라 기본형을 참조형으로 바꿔야 함
		//			=> 기본 타입에 관련된 Boxing(Wrapping)을 통해 참조형으로 변경할 수 있는 클래스를 Wrapper 클래스라고 함
		// boolean <=> Boolean 
		// byte <=> Byte
		// char <=> Character
		// short <=> Short
		// int <=> Integer
		// long <=> Long
		// float <=> Float
		// double <=> Double
		
		String d = "10";
		String e = "3.14";
		
		System.out.println("문자열 10을 Integer 타입의 10으로 변경 => "+ Integer.valueOf(d));
		System.out.println("문자열 3.14를 Double 타입의 3.14로 변경 => "+ Double.valueOf(e));
		System.out.println("문자열 10을 Byte 타입의 10으로 변경 => "+ Byte.valueOf(d)); //Byte : 절대값

		
	}

}

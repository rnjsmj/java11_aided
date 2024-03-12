
package sec2;
//람다식 : 함수 및 메서드를 간소화한 표현식
//자바의 기본적인 람다식 정의 방법 => 함수적 인터페이스 (Functional Interface)
// => @FunctionalInterface로 정의 (Annotation), 하나의 인터페이스에 오로지 하나의 메서드만 가짐
	
//* Annotation : 개발자가 컴파일러에게 특정한 것임을 알려주는 것 (기술하지 않으면 컴파일러 오류 발생)
	
@FunctionalInterface
interface Lambda1 {
	void method1();
}

@FunctionalInterface
interface Lambda2 {
	void method2(int x, int y);
}

@FunctionalInterface
interface Lambda3 {
	int method3();
}

@FunctionalInterface
interface Lambda4 {
	int method4(int x, int y);
}
	
public class LambdaExam {
	public static void main(String[] args) {
		/* 람다식 X
		Lambda1 f1 = new Lambda1() {
			@Override
			public void method1() {
				int x = 100, y = 200;
				System.out.println(x+y);	
			}
		};
		*/
		
		//하나의 인터페이스에 하나의 메서드만 선언했기 때문에 메서드 이름을 쓰지 않음
		System.out.println("1");
		//구현체 f1
		Lambda1 f1 = () -> {
			int x=100, y=200;
			System.out.println(x+y);
		};
		f1.method1();
	
		System.out.println("2");
		Lambda2 f2 = (int x, int y) -> {
			System.out.println(x+y);
		};
		f2.method2(100, 200);
		
		System.out.println("3");
		Lambda3 f3 = () -> {
			int x=100, y=200;
			return x+y;
		};
		System.out.println(f3.method3());
		
		System.out.println("4");
		Lambda4 f4 = (int x, int y) -> {
			return x+y;
		};
		System.out.println(f4.method4(100,200));
	}

}

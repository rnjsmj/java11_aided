package sec2;
//함수 (메서드) 정의와 사용법
//메서드 : 특정 클래스에 멤버로 규정되어 있어 객체 생성을 하고, 해당 객체.메서드명(...)을 통해 호출
//함수 : 객체 생성 없이 사용 / 다른 클래스에서 재사용할 수 없음


//메서드 기술
class Met1 {
	void method1() {
		int x = 100, y = 200;
		System.out.println(x+y);
		
	}
}

class Met2 {
	void method2(int x, int y) {
		System.out.println(x+y);
	}
}

class Met3 {
	int method3() {
		int x = 100, y = 200;
		return x+y;
	}
}

class Met4 {
	int method4(int x, int y) {
		return x+y;
	}
}

public class FunctionExam {

	public static void main(String[] args) {
		Met1 met1 = new Met1();
		met1.method1();
		
		Met2 met2 = new Met2();
		met2.method2(100, 200);
		
		Met3 met3 = new Met3();
		System.out.println(met3.method3());
		
		Met4 met4 = new Met4();
		System.out.println(met4.method4(100, 200));
		
		fnc1();

	}
	
	//함수 => 객체생성 없이 사용
	public static void fnc1() {
		int x = 100, y = 200;
		System.out.println(x+y);
		
	}
	
	

}

package sec1;
//정적 내부 클래스인 Inner 클래스는 외부/내부 모두 정적 요소만 허용
//class Outer {} //(default) => 같은 패키지에 동일한 이름의 클래스가 존재해서 생성 불가
class Outer2 {
	private int num =10;
	private static int sNum = 20;
	
	//정적 내부 클래스
	static class Inner { //Outer2.Inner =/ Outer.Inner
		int inNum = 1000;
		static int sInNum = 2000;
		
		
		void inMethod() {
			System.out.println("내부 => 내부 클래스의 인스턴스 변수 inNum = " + inNum); 
			System.out.println("내부 => 내부 클래스의 정적 멤버 변수 sInNum = " + sInNum);
//			System.out.println("외부 클래스의 인스턴스 변수 num = " + num); //외부 클래스에서 내부 클래스의 인스턴스를 생성하지 않아 접근 불가능
			System.out.println("내부 => 외부 클래스의 정적 멤버 변수 sNum = " + sNum); //정적 멤버변수이므로 접근 가능
			
		}
	}
	
	//정적 메서드는 정적 멤버만 사용할 수 있음
	static void outMethod() { //외부 클래스의 정적 메서드
		//
//		System.out.println("외부 => 내부 클래스의 인스턴스 변수 inNum = " + inNum);
		System.out.println("외부 => 내부 클래스의 정적 멤버 변수 sInNum = " + Inner.sInNum); //정적 멤버변수 이므로 객체 생성 없이 접근 가능
//		System.out.println("외부 => 외부 클래스의 인스턴스 변수 num = " + num); //정적 메서드는 정적 멤버만 사용할 수 있음
		System.out.println("외부 => 외부 클래스의 정적 멤버 변수 sNum = " + sNum); 
	}
}

public class StaticInnerClassExam {

	public static void main(String[] args) {
		Outer2 out = new Outer2(); //외부 클래스의 인스턴스
//		out.outMethod(); //outMethod()는 정적메서드이므로 객체 생성하지 않고 호출해야 함
		Outer2.outMethod(); 
//		Outer2.Inner.inMethod(); //inMethod()는 인스턴스 메서드이므로 정적 클래스인 Inner로 실행 불가
//		out.Inner.inMethod(); //Inner는 정적 클래스 이므로 인스턴스 생성하지 않고 호출해야 함
		
		
		Outer2.Inner inner = new Outer2.Inner(); //정적 내부 클래스의 인스턴스
		inner.inMethod(); //정적 내부 클래스는 
		
		//외부 클래스 =>  외부 메서드 모두 실행 가능 (내부에는 접근 불가능)
		//정적 내부 클래스로 생성된 인스턴스는 내부  메서드 및 멤버 변수의 접근, 실행 가능 

	}

}

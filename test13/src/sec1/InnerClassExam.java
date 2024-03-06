package sec1;
//내부 클래스 : 클래스 내부에 생성된 클래스

class Outer { //외부 클래스
	private int num = 10;
	private static int sNum = 20; //정적 멤버필드
	
	public Inner inner; //인스턴스 내부 클래스
	
	public Outer() { //Outer 생성자를 사용하게 되면 자동적으로 내부 클래스에 대한 인스턴스 생성
		inner = new Inner();
		
	}
	
	class Inner { //내부 클래스
		int inNum = 1000;
		void inMethod() {
			System.out.println("내부클래스에서 외부클래스의 멤버 접근 num : " + num);
			System.out.println("내부클래스에서 외부클래스의 정적 멤버 접근 sNum : " + sNum);
			//내부 => 외부 접근 : 클래스 선언 없이 사용 *
		}
	}
	
	public void outMethod() { //외부클래스에서 내부클래스의 메서드 호출
		inner.inMethod(); //외부 => 내부 접근 : 선언한 인스턴스 사용 *
	}
}

public class InnerClassExam {
	
	public static void main(String[] args) {
		Outer out = new Outer();
		out.outMethod(); //타 클래스에서 외부 클래스 호출 : 클래스 객체 생성 후 외부 클래스 호출
		out.inner.inMethod(); //타 클래스에서 내부 클래스 호출 :  객체 생성후 내부 클래스의 멤버 메서드 호출 (내부 클래스 멤버를 public으로 선언해야 함)

	}

}

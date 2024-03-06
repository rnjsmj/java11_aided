package sec1;

class Outer3 { //외부 클래스
	//익명 내부 클래스 선언 시 Runnable로 구현해야 함
	Runnable getRunnable(int i) { //Runnable interface 
		int num = 100;
		return new Runnable() { //instance 생성시 기본 메서드인 run 구현해야 함

			@Override
			public void run() {
				System.out.println(i);		//매개변수
				System.out.println(num);	//지역변수
			} 
			
		};
	}
	
	//익명의 실행 인스턴스(객체)를 Runnable()로 생성
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable로 구현된 익명의 내부 클래스");
		}
	};
}

public class AnonymousInnerExam {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.runner.run();
		out.getRunnable(3).run();
		//out.getRunnable(3) //Runnable이 만들어지지 않아 실행결과 x
		
		Runnable runAble = out.getRunnable(500); //외부 클래스의 내부 클래스 없이 생성된 인스턴스는 Runnable로 선언하여 생성
		runAble.run();
		
	}

}

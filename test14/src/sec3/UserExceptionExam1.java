package sec3;

//모든 예외의 상위 클래스인 Exception 클래스 상속
class RunException extends Exception {
	public RunException() {}
	public RunException(String msg) {
		System.out.println("msg : " + msg);
		System.out.println("사용자 정의 예외 발생");
	}
}

public class UserExceptionExam1 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (RunException e) {
			e.printStackTrace();
		}
	}

	public static void method1() throws RunException { //Add throws Declaration
		throw new RunException("사용자 예외");
	}
}

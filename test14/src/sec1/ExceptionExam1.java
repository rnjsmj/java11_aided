package sec1;

//예외(Exception) : 프로그래밍 로직 상 에러가 발생하면, 그 다음 문장은 처리되지 못하고 실행이 중지됨
//	==> 다음 문장까지 실행될 수 있도록 처리하는 것이 예외 처리
public class ExceptionExam1 {

	public static void main(String[] args) {
		String name = null;
		//실행한 try문에서 예외가 발생하면 예외처리 문장 catch문을 실행
		try { //실행할 문장
			System.out.println(name.toString());
		} catch( Exception e) {
			//예외처리 문장
			System.out.println("예외 발생");
		}

	}

}

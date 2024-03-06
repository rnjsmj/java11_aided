package sec1;

public class ExceptionExam2 {

	public static void main(String[] args) {
		String name = null;
		//실행한 try문에서 예외가 발생하면 예외처리 문장 catch문을 실행
		//다중 catch 문
		try { //실행할 문장
			System.out.println(name.toString());
			System.out.println("정상처리");
		} catch(NullPointerException e) { //출력문장 ...
			e.printStackTrace();
			name = "이름";
			System.out.println(name + "\n예외처리");
		} catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
		}

		
	}

}

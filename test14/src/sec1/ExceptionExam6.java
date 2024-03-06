package sec1;

public class ExceptionExam6 {

	public static void main(String[] args) {
		try {
			Class driver = Class.forName("oracle.jdbc.driver");
		} catch(ClassNotFoundException e) { //해당 클래스를 찾을 수 없는 경우 (드라이버 패키지 이름, 라이브러리 추가 등.. 이슈)발생하는 예외
			System.out.println("해당 오라클 드라이버를 찾지 못했습니다.");
			e.printStackTrace();
		}  catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
			e.getMessage();
		} finally {
			System.out.println("종료");
		}

	}

}

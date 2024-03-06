package sec1;

public class ExceptionExam4 {

	public static void main(String[] args) {
		String data1 = "1004";
		String data2 = "kim1004";
		int val1, val2;
		
		try {
			val1 = Integer.parseInt(data1);
			val2 = Integer.parseInt(data2);
			
		} catch(NumberFormatException e) { //숫자 형태 아닌 경우 발생하는 예외
			System.out.println("숫자 형식으로 처리할 수 없는 데이터");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
			e.getMessage();
		} finally {
			System.out.println("종료");
		}
		
	}

}

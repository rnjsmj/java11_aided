package sec1;

public class ExceptionExam3 {

	public static void main(String[] args) {
		int[] nArr = {90, 85, 100};
		int i = 0;
		while (i<=3) {
			try {
				System.out.println(nArr[i]);
				i++;
			} catch(ArrayIndexOutOfBoundsException e) { //배열 범위 초과하는 경우 발생
				e.getMessage();
				break; //반복문 탈출
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				//예외 발생 여부와 상관 없이 무조건 실행하는 문장
				System.out.println("작업종료");
			}
			
		}

	}

}

package sec2;

import java.io.IOException;

public class SystemInExam {

	public static void main(String[] args) throws IOException {
		System.out.println("영문 한 글자 입력 후 [Enter]를 누르시오.");
		int i;
		try {
			i = System.in.read(); //아스키코드 한 글자 입력 => 바이트 단위 입력
			System.out.println(i);
			System.out.println("입력된 문자 : " + ((char) i));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

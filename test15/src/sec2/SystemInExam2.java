package sec2;

import java.io.IOException;

public class SystemInExam2 {

	public static void main(String[] args) throws IOException {
		System.out.println("영문 단어 또는 문장 입력 후 [Enter]를 누르시오.");
		int i;
		String data = "";
		try {
			while((i = System.in.read()) != '\n') {
				System.out.println((char) i);
				data += (char) i;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("입력된 데이터 : " + data);
	}

}
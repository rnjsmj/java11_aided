package sec1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//BufferedInputStream : 바이트 단위로 입력하기 위한 스트림 (메모리 버퍼로 로딩 후)
// 메모리 버퍼 로딩 => 파일 객체 생성하지 않아도 됨 (파일에 직접 접근 불가 => FileInputStream 이용)
public class BufferedInputStreamExam {

	public static void main(String[] args) throws IOException{
		BufferedInputStream input = null;
		try {
			input = new BufferedInputStream(new FileInputStream("a.txt"));
			while (input.available() > 0) {
				System.out.println((char) input.read());
			}
		} catch(IOException e) {
			System.out.println("파일 읽기 실패");
		} finally {
			//Auto close 안되는 경우
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
					
				}
		}
		
	}

}
}
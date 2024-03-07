package sec1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//FileInputStream : 바이트 스트림 단위로 파일 내용을 읽기 위한 클래스
//바이트 단위로 읽어오므로 char로 변환해야 함
//유니코드(한글, 전각문자 등)는 읽어낼 수 없음
public class FileInputStreamExam1 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("a.txt");
		//EOF(End Of File) => -1
		FileInputStream fis = new FileInputStream(f1);
		int i;
		while((i = fis.read()) != -1) {
			System.out.println((char) i); //byte => char (ASCII CODE)
		}
//		try {
//			fis.close();
//		} catch (Exception e){
//			System.out.println("");
//		}
		
	}

}

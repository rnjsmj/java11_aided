package sec1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream : 파일의 내용을 바이트 단위로 쓰기 위한 클래스
public class FileOutputStreamExam {

	public static void main(String[] args) throws IOException {
		File f1 = new File("b.txt");
		
		if(f1.createNewFile()) {
			System.out.println("파일 생성 성공");
			
		} else {
			System.out.println("이미 파일 존재");
		}
		
		String data = "Hello Java";
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(data.getBytes()); //String => byte 단위 배열
		fos.close();
	}

}

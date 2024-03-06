package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionExam7 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream os = null;
		
		
		try {
			//두 문장 모두 try~catch문 자동생성 가능
			fis = new FileInputStream("indata.txt"); 
			os = new FileOutputStream("outdata.txt");
		} catch (FileNotFoundException e) { //해당 경로에 파일이 존재하지 않는 경우 발생하는 예외
			System.out.println("해당 파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
			e.printStackTrace();
		} finally {
			System.out.println("종료");
		}
		

	}

}

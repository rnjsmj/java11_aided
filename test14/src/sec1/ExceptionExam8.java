package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionExam8 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream os = null;
		
		//중첩 try~catch
		//내부에 있는 Exception 객체의 이름은 외부에 있는 객체와 이름이 달라야 함
		try {
			fis = new FileInputStream("indata.txt"); 
			try {
				os = new FileOutputStream("outdata.txt");
			} catch (FileNotFoundException e1) {
				System.out.println("os의 해당 파일을 찾을 수 없습니다.");
			}
			
		} catch (FileNotFoundException e) { 
			System.out.println("fis의 해당 파일을 찾을 수 없습니다.");
			try {
				os = new FileOutputStream("outdata.txt");
			} catch (FileNotFoundException e1) {
				System.out.println("os의 해당 파일을 찾을 수 없습니다.");
			}
		} catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
			e.printStackTrace();
		} finally {
			System.out.println("종료");
		}
	}
}

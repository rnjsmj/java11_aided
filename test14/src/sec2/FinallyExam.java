package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyExam {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("indata.txt"); 
		} catch (FileNotFoundException e) { 
			System.out.println("해당 파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try { 
					fis.close(); //IOException 예외 처리 자동 생성
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("성공 여부 상관 없이 수행");
		}
		
		FileOutputStream ois = null;
		try {
			ois = new FileOutputStream("outdata.txt");
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
		} finally {
			if (ois != null) {
				try { 
					ois.close(); //IOException 예외 처리 자동 생성
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("성공 여부 상관 없이 수행");
		}
		
		System.out.println("예외처리 다음 문장");

	}

}

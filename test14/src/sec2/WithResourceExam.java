package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Auto close 사용하기
class AutoResource implements AutoCloseable { //AutoCloseable은 열린 객체를 자동으로 닫는 인터페이스

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 자동으로 Close 되었습니다.");
		
	}
	
}
public class WithResourceExam {

	public static void main(String[] args) throws Exception {
//		FileInputStream fis = null;
//		fis = new FileInputStream("a.txt"); 
		//try~with~resource : 열린 리소스(파일 등)는 모두 닫힘 (if문으로 비교하지 않아도 됨)
		try (AutoResource obj = new AutoResource()){
			throw new Exception();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("예외");
		}
	
	}

}

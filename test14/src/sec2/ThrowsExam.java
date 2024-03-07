package sec2;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
//예외 넘기기
public class ThrowsExam {
												 //IOException > FileNotFoundException
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		
		String absolutePath = "D:\\minji\\java2\\test14\\bin\\sec2\\a.txt"; //절대경로
		String relativePath = "./a.txt";	//상대경로 -> 현재 디렉토리
		String relativePath2 = "../a.txt";	//상대경로 -> 상위 디렉토리
		String relativePath3 = "../../a.txt";	//상대경로 -> test14 내부
		
		//**** Add throws declaration ****
		fis = new FileInputStream("a.txt"); 
		if (fis != null) {
			fis.close();
		}

	}

}

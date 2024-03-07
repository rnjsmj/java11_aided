package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException{
		//파일 상대경로 지정
		File f1 = new File("a.txt"); //현재 디렉토리의 파일과 상관 없이 파일객체 생성
		/*
		 * if (f1==null) { System.out.println("현재 파일이 존재하지 않습니다."); } else {
		 * System.out.println("현재 파일이 존재합니다."); }
		 */
		File f2 = new File("../sec1/a.txt"); //상위 디렉토리로 이동 후 sec1 디렉토리
		
		//파일 절대경로 지정
		File f3 = new File("d:" + File.separator + "minji" + File.separator 
				+ "java2" + File.separator + "a.txt");
		String path = "D:\\minji\\java2\\";
		File f4 = new File(path, "a.txt");
		File f5 = new File("D:\\minji\\java2\\", "a.txt");
	}

}

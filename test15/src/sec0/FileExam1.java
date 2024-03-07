package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam1 {

	public static void main(String[] args) throws IOException{
		String file1 = "D:\\minji\\java2\\a.txt"; //로컬경로
		String file2 = "http://"; //원격경로(url)
		File f1 = new File(file1);
		
		//파일 이름
		String fileName = f1.getName(); 
		System.out.println("파일명 : " + fileName);
		
		//확장자 제외 파일 이름
		int pos = fileName.lastIndexOf(".");
		System.out.println("확장자 표시 점 위치 : " + pos);
		System.out.println("확장자 제외 파일명 : " + fileName.substring(0, pos)); //파일명의  첫 글자부터 pos(.)의 앞글자까지
		System.out.println("확장자 : " + fileName.substring(pos+1)); //pos(.)의 다음 글자부터 끝까지
		
		//경로
		System.out.println("절대경로 : " + f1.getAbsolutePath());
		System.out.println("상대경로 : " + f1.getPath());
		System.out.println("파일의 상위 디렉토리 : "+ f1.getParent());
		System.out.println("경로 구분자 : " + File.separator); // == File.separatorChar
		
		//시스템 변수 출력 (System.getProperty("시스템변수명"))
		System.out.println("현재 사용자 디렉토리(user.dir) : " + System.getProperty("user.dir"));
		System.out.println("자바 디렉토리(sun.boot.class.path) : " + System.getProperty("sun.boot.class.path"));// >>> OpenJDK => null
		System.out.println("운영체제(OS) 환경변수 값 : " + System.getenv());
		System.out.println("JAVA_HOME : " + System.getenv("JAVA_HOME"));
		
		
		
	}

}

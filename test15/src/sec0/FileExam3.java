package sec0;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//파일, 디렉토리 제어
public class FileExam3 {

	public static void main(String[] args) throws IOException {
		File f = new File("student");
		f.mkdir(); //디렉토리 생성 >>> 현재 디렉토리(test15)에 f(student) 디렉토리 생성
		
		File f2 = new File("manage/teacher/kr"); 
		f2.mkdirs(); //현재 디렉토리에 manage > teacher > kr 경로로 복수개 디렉토리 생성
		
		//디렉토리 생성은 이미 존재하면 실행 x
		
		//디렉토리 생성날짜, 시간 변경
		f.setLastModified(new Date().getTime()); //현재 날짜, 시간
		
		//디렉토리 읽기 전용으로 변환
		f.setReadOnly();
		
		
	}

}

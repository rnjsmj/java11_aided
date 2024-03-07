package sec1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {

	public static void main(String[] args) throws IOException{
		File file = new File("e.txt");
		if(!file.exists()) { //file이 존재하지 않을 경우
			file.createNewFile(); //file 생성
		}
		
		BufferedWriter fw = new BufferedWriter(new FileWriter(file, true));
		fw.write("문자, 문자열 모두 입력 가능한 BufferedWriter");
		fw.newLine();
		fw.write("줄바꾸고 입력");
		fw.newLine();
		fw.write("너무하네!");
		fw.flush();
		fw.close();
		
	}

}

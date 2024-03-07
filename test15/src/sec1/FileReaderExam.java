package sec1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//BufferedReader, FileReader : 문자(열) 단위로 읽음
public class FileReaderExam {

	public static void main(String[] args) throws IOException{
		File file = new File("d.txt");
		if(file.exists()) { //file이 존재하는지 
			BufferedReader fr = new BufferedReader(new FileReader(file)); //BufferdReader : line 단위
			String line = null;
			while((line = fr.readLine()) != null) {
				System.out.println(line);
			}
			fr.close();
		}
	
	}

}

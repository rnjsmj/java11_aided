package sec1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExam {

	public static void main(String[] args) throws IOException{
		BufferedOutputStream output = null;
		String str = "BufferedOutputStream";
		
		try {
			output = new BufferedOutputStream(new FileOutputStream("c.txt"));
			output.write(str.getBytes());
		} catch(IOException e) {
			System.out.println("출력할 데이터 파일 오류");
		} finally {
			//Auto close 안되는 경우
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();	
				}
			}
		}

	}
}
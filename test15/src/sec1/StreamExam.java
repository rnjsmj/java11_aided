package sec1;
//파일/키보드/데이터 입력 : FileInputStream, BufferedInputStream, FileReader, BufferedReader
//파일/모니터/데이터 출력 : FileOutputStream, BufferedOutputStream, FileWriter, BufferedWriter
// => Stream 클래스는 데이터 입출력을 바이트 단위로
// =>  다른 클래스는 데이터 입출력을 문자 단위로 (=> 문자, 문자열 데이터는 Reader, Writer 클래스)
// => File 클래스는 File 객체를 생성하고 활용하는 것이 좋음
public class StreamExam {

	public static void main(String[] args) {
		 String fileInputStream = "FileInputStream : 바이트 단위로 입력하기 위한 스트림";
		 String bufferdInputStream = "BufferedInputStream : 바이트 단위로 입력하기 위한 스트림 (메모리 버퍼로 로딩 후)";
		 String fileReader = "FileReader : 문자 단위로 입력하기 위한 스트림";
		 String bufferedReader = "BufferedReader : 문자 단위로 입력하기 위한 스트림 (메모리 버퍼로 로딩 후)";
		 String fileOutputStream = "FileOutputStream : 바이트 단위로 출력하기 위한 스트림";
		 String bufferdOutputStream = "BufferedOutputStream : 바이트 단위로 출력하기 위한 스트림 (메모리 버퍼로 로딩 후)";
		 String fileWriter = "FileWriter : 문자 단위로 출력하기 위한 스트림";
		 String bufferedWriter = "BufferedWriter : 문자 단위로 출력하기 위한 스트림 (메모리 버퍼로 로딩 후)";
		 
		 System.out.println(fileInputStream);
		 System.out.println(bufferdInputStream);
		 System.out.println(fileReader );
		 System.out.println(bufferedReader );
		 System.out.println(fileOutputStream);
		 System.out.println(bufferdOutputStream);
		 System.out.println(fileWriter);
		 System.out.println(bufferedWriter);
		 
		 
	}

}

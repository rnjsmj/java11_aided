package sec2;

public class StringExam1 {

	public static void main(String[] args) {
		String name1 = "이름";
		String name2 = new String("이름");
		
		Integer su1 = 1004;
		String su2 = "1004";
		System.out.println(su1.equals(su2)); //Integer와 String 모두 참조형이므로 비교 가능
		
		String su3 = String.valueOf(su1); //su1을 String으로 변환하여 su3에 대입
		System.out.println(su2.equals(su3));
		
		String str = "1/2/3/4/5/6";
		String[] nums = new String[6];
		
		//* 표시 중요!!
		//문자열 나누기 *
		nums = str.split("/");
		for (String s:nums) {
			System.out.println(s);
		}
		
		//문자열 합치기 *
		String str2 = String.join("/", nums);
		System.out.println(str2);
		
		
		String data = "   ivE\'s beaUty grOup\nnewJeans is girlGroup Top   ";
		
		char ten = data.charAt(9); 			//10번째 문자
		System.out.println("인덱스 9인 문자 : " + ten);
		String trimData = data.trim();		//앞 뒤 공백 제거하여 trimData에 저장
		System.out.println("앞뒤 공백 제거 : " + trimData.length()+"글자, " + trimData);
		int size = trimData.length();		//글자수 size에 저장
		System.out.println("글자수 : " + size);
		int n = data.indexOf('n'); 			//처음 나온 'n'의 위치를 n에 저장
		System.out.println("앞에서의 n의 위치를 n에 저장 : " + n);
		int n2 = data.lastIndexOf('n'); 			//뒤에서부터 처음 나온 'n'의 위치를 n에 저장
		System.out.println("뒤에서의 n의 위치를 n2에 저장 : " + n2);
		String up = data.toUpperCase();		//모두 대문자 변환
		System.out.println("모두 대문자 변환 : " + up);
		String down = data.toLowerCase();	//모두 소문자 변환
		System.out.println("모두 소문자 변환 : " + down);
		String sub1 = data.substring(22,30);//공백 제거 후 20~30번째 추출 *
		System.out.println("공백 제거 후 22~30번째 추출 : " + sub1);
		String sub2 = data.replace("newJeans", "Kep1er"); 		//newJeans의 단어를 Kepler로 변환
		System.out.println("newJeans의 단어를 Kepler로 변환 : " + sub2);
		byte[] girl = trimData.getBytes();		//문자열을 girl 문자배열로 변환하여 저장 *
		System.out.println("글자 수 : " + girl.length);
		for (byte b:girl) {
			char k = (char) b;
			System.out.print(k);
		}
		System.out.println();
		
		
		//뒤에서부터 찾은 g부터 9글자 출력 (girlGroup)
		String girlgroup = data.substring(data.lastIndexOf('g'), data.lastIndexOf('g')+9);
		girlgroup = girlgroup + " " + sub1;
		System.out.println("girlGroup : " + girlgroup);
		
		
		//문자배열(byte[] girl)을 문자열(String)으로 변환
		String str4 = new String(girl);
		System.out.println("문자열 girl : " + str4);
		
	}
	

}

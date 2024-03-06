package sec2;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String names = "1, 2, 3, 4, 5, 6"; //? 토큰 : 구분기호(delim)를 의미
		String anis = "1 \f 2 \n 3 \t 4 \r 5";
		System.out.println(anis);
		
		
		//출력제어문자와 같은 것은 토큰을 기재하지 않아도 자동으로 토큰으로 간주
		StringTokenizer st = new StringTokenizer(anis);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		
		//특정 문자가 토큰인 경우 
		StringTokenizer name = new StringTokenizer(names, ",");
		while(name.hasMoreTokens()) {
			System.out.println(name.nextToken().trim());
		}
	}

}

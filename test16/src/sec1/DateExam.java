package sec1;

import java.time.LocalDate;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date date1 = new Date();
		
		Date date2 = new Date(1981, 12, 25, 7, 24, 59);
		System.out.println(date2); //>>> Jan으로 출력
		//Date의 월은 0부터 시작 >>> 12월은 [11]로 입력
		Date date3 = new Date(1981, 11, 25, 7, 24, 59);
		System.out.println(date3);
		
		//Date사용 시 Annotaion
		@SuppressWarnings("deprecation")
		Date date4 = new Date(1981, 11, 25, 7, 24, 59);
		@SuppressWarnings("deprecation")
		Date date5 = new Date("Sun, 02 Apr 2001 07:24:59 + 0900"); //Timezone
		System.out.println(date5);
		
		//Timezone 규격
		//지역이름(Global/Local) : KST
		//RFC 822 : +0900
		//국가코드 : KR
		//언어코드 : KO => KO_KR
		
		System.out.println();
		System.out.println("***** LocalDate *****");
		
		LocalDate now1 = LocalDate.now();
		System.out.println(now1); //날짜 데이터
		// 날짜 데이터 => 문자열 데이터
		String now2 = now1.toString();
		System.out.println(now2.getClass().getName());
		//문자열 데이터 => 날짜 데이터
		LocalDate now3 = LocalDate.parse(now2);
		
		
		
		
	}

}

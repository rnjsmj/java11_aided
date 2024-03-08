package sec1;
//SimpleDateFormat : 날짜 표시 형식을 지정할 때 활용하는 클래스

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExam {

	public static void main(String[] args) {
		Date today = new Date();
		
		//표시형식 코드 : 년-y, 월-M, 일-d, 시-h, 분-m, 초-s, 요일-E, 오전/오후 -a, 해당 월 중 주차-W, 해당 연 중 주차-w
		SimpleDateFormat fmt1 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat fmt2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat fmt3 = new SimpleDateFormat("오늘 날짜 : yyyy년 MM월 dd일(E), 현재 시각 : a hh시 mm분");
		SimpleDateFormat fmt4 = new SimpleDateFormat("yyyy년 MM월 W번째 주");
		
		//날짜데이터 => 특정 표시형식 부여된 문자열로 변환
		String t1 = fmt1.format(today);
		System.out.println(t1);
		String t2 = fmt2.format(today);
		System.out.println(t2);
		String t3 = fmt3.format(today);
		System.out.println(t3);
		String t4 = fmt4.format(today);
		System.out.println(t4);
	}

}

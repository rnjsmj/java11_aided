package sec1;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); //== Date today = new Date(); //Singletone
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1; //월 : 0~11
		int day = today.get(Calendar.DATE);
		
		System.out.println("현재 년도 : "+ year);
		System.out.println("현재 월 :" + month);
		System.out.println("현재 일 :" + day);
		
		int doy = today.get(Calendar.DAY_OF_YEAR);
		int dom = today.get(Calendar.DAY_OF_MONTH);
		int dow = today.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("현재 년도로부터 일 수 : " + doy);
		System.out.println("현재 월로부터 일 수 : " + dom);
		System.out.println("현재 주로부터 일 수 : " + dow);
		
		String[] wk = {"", "일요일", "월요일", "화요일", "수요일","목요일","금요일","토요일"};
		System.out.println("오늘은 " + wk[dow] + "입니다.");

		int hour12 = today.get(Calendar.HOUR); //12시간
		int hour24 = today.get(Calendar.HOUR_OF_DAY); //24시간
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		int ampm = today.get(Calendar.AM_PM);
		
		System.out.println("현재 시 (12시간) : " + hour12);
		System.out.println("현재 시 (24시간) : " + hour24);
		System.out.println("현재 분 : " + minute);
		System.out.println("현재 초 : " + second);
		System.out.println("현재 기준: " + ampm);
		
		System.out.println("\n현재 시각 : " + hour24 + ":" + minute + ":" + second);
		if (ampm == 0) System.out.println("현재 시각 : 오전 " + hour12 + ":" + minute + ":" + second);
		else System.out.println("현재 시각 : 오전 " + hour12 + ":" + minute + ":" + second);
		
		
		int timeZone = today.get(Calendar.ZONE_OFFSET); // 밀리초 기준으로 값 반환 => 시간 기준으로 변환 : /1000/60/60 연산 
		int lastDate = today.getActualMaximum(Calendar.DATE); //Minimum : 첫날, Maximum : 마지막 날
		int FirstDate = today.getActualMinimum(Calendar.DATE);
		
		System.out.println("타임존 (밀리초) : " + timeZone);
		System.out.println("타임존 (시간) : " + timeZone/(1000*60*60));
		System.out.println("달 마지막 날 : " + lastDate);
		System.out.println("달 첫 날 : " + FirstDate);
	}

}

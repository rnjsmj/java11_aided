package sec1;
//Enum : 열거형으로 상속이나 인스턴스 생성 불가
//  => (어디서나 사용할 수 있어야 하기 때문에 ) public, static, final 
// 데이터 값의 의미를 명확하게 해야하거나 컴파일 시 데이터 타입 및 유효성 체크를 하려고 할 경우 활용

enum Week1 { //(기본적으로) 상수 => 대문자로 열거
	SUN, MON, TUE, WED, THU, FRI, SAT
}

/* 
 * method
valueOf({String}) : 문자열 str과 일치하는 열거값 반환
values() : 열거(값)형 전체를 배열로 반환
ordinal() : 열거(값)형 순서를 반환
*/

enum Week2 { 
	SUN("일"), MON("월"), TUE("화"), WED("수"), THU("목"), FRI("금"), SAT("토");
	//상수값 안에 문자열이 있음을 선언
	final private String day;
	Week2(String day){
		this.day = day;
	}
	
	String getDay() {
		return day;
	}
}

public class EnumExam1 {
	public static void main(String[] args) {
		String s = "MON";
		Week1 w1 = Week1.SUN;
		Week2 w2 = Week2.valueOf(s);
		
		System.out.println(w1);
		System.out.println(w2);
		
		Week1[] arrWeek1 = Week1.values();
		for ( Week1 w : arrWeek1 ) {
			switch(w) {
				case SAT: System.out.println("토요일"); break;
				case SUN: System.out.println("일요일"); break;
				default : System.out.println("평일");
			}
			
		}
		System.out.println();
		
		Week2[] arrWeek2 = Week2.values();
		for ( Week2 w : arrWeek2 ) {
			
			System.out.println(w.ordinal() +  "번째 요일 => " + w.getDay());
		}
	}
}

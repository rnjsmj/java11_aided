package sec3;
//PMD ; Code Inspection Tool  
//Code Inspection Level (github 참고)
// Code Inspection : 성능 개선, 코드 작성 규칙 준수, 에러 발생 가능성 최소화하기 위한 소스코드 검증 작업
public class CodeInspectorExam {

	public static void main(String[] args) {
		Reader r1 = new Reader();
		Reader r2 = new Reader(2, "http://www.naver.com", "네이버 사이트", 1);
		r1.def = "시작페이지";
//		System.out.println(r2.toString());
//		System.out.println(r2.def);
	}
}

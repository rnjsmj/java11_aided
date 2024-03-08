package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//mybox pdf파일 참고

public class PatternExam2 {

	public static void main(String[] args) {
		String[] email = {"kwonmj123", "kbs@naver", "rnjs@gmail.com", "kim@kr", "lee@daum.net"};
		Pattern p1 = Pattern.compile("^[a-zA-Z0-9]+@[a-z0-9]+\\.[a-z]+$"); //이메일 패턴
		//특수문자의 경우 \\ 표시 
		for (int i=0; i<email.length; i++) {
			Matcher m = p1.matcher(email[i]);
			if (m.matches()) {
				System.out.println("이메일 형식 맞음");
				System.out.println(email[i]);
			}
		}
		
		String[] phone = {"02-352-8592", "010-4892-8592", "017-3456-1459", "010-146-8960", "010-9980-7485"};
		Pattern p2 = Pattern.compile("010-\\d{4}-\\d{4}"); //휴대폰 번호 패턴
		//  \\d{n} : \d 는 [0-9]와 동일, {n}은 정확히 n개 의미  ({n,m} : n개 이상 m개 이하)
		for (int i=0; i<email.length; i++) {
			Matcher m = p2.matcher(phone[i]);
			if (m.matches()) {
				System.out.println("전화번호 형식 맞음");
				System.out.println(phone[i]);
			}
		}
		
		String[] jm = {"010820-4669854", "970430-1227892", "145692-7123456", "61594-1234567", "250146-12345678"};
		Pattern p3 = Pattern.compile("\\d{6}\\-[1-4]\\d{6}"); //주민등록번호 패턴
		for (int i=0; i<jm.length; i++) {
			Matcher m = p3.matcher(jm[i]);
			if (m.matches()) {
				System.out.println("주민등록번호 형식 맞음");
				System.out.println(jm[i]);
			}
		}
		
		//100~700번대 (3자리-2자리) 구조
		
		String[] post = {"123-123", "212-34", "816-24", "5469-12", "689-34"};
		Pattern p4 = Pattern.compile("[1-7]\\d{2}-\\d{2}"); //우편번호 패턴
		for (int i=0; i<post.length; i++) {
			Matcher m = p4.matcher(post[i]);
			if (m.matches()) {
				System.out.println("우편번호 형식 맞음");
				System.out.println(post[i]);
			}
		}
		
		//비밀번호 패턴 ㅣ 4~10글자, 영문 대소문자 + 특수문자(!@#$%^&*?_), 숫자 모두 최소 하나씩 포함
		// () 반드시 포함
		// ? 한문자
		// =. 이상
		// * 뒤에 나오는 조건으로
		//(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4, 10}$
		String[] pw = {"abcd1234", "A123a", "1234", "ABCD!123456", "Abc!432","KIM#1004"};
		Pattern p5 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$"); //비밀번호 패턴
		for (int i=0; i<pw.length; i++) {
			Matcher m = p5.matcher(pw[i]);
			if (m.matches()) {
				System.out.println("비밀번호 형식 맞음");
				System.out.println(pw[i]);
			}
		}
		
	}

}

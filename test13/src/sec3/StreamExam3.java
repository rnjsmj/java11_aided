package sec3;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//redeuce() 활용 => 차원 축소
//예시 : 여러 문자열 배열에서 가장 글자수가 많은 (2진수 값이 가장 큰) 문자열을 찾아 반환하기
//BinaryOperator 이용 : 문자, 숫자 모두 2진수로 변환하여 처리할 때 활용되는 인터페이스
class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length > s2.getBytes().length) {
			return s1;
		} else return s2;
	}
	
}
public class StreamExam3 {
	
	public static void main(String[] args) {
		String[] arr = {"김수한무", "거북이와 두루미", "삼천갑자동방삭", "키위새", "eee", "Kwon minji"};
		
		//람다식 처리
		System.out.println(Arrays.stream(arr).reduce("", (s1, s2) -> {
			if(s1.getBytes().length > s2.getBytes().length) return s1;
			else return s2;
		}));
		
		//BinaryOperator활용
		System.out.println("BinaryOperator를 활용한 reduce");
		String res = Arrays.stream(arr).reduce(new CompareString()).get();
		System.out.println(res);
	}

}

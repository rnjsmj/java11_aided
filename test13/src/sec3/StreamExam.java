package sec3;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamExam {
	//Stream : 연속된 복합체(컬렉션 프레임워크 형태)로 이루어진 데이터(=>비트열) 
	//Stream 방식 => 연속된 복합체를 간결하고 효과적으로 처리하기 위한 람다식 방식의 처리  => 입출력 방식 제어
	
	public static void main(String[] args) {
		//stream 이용 
		
		int[] arr = {95, 80, 100, 85, 90};
		//배열형의 경우 별도 stream 생성 x, Arrays 클래스 사용
		//  => Arrays.stream(복합체).method();
		
		//순회 출력  //forEach() : stream에서 사용하는 반복문
		System.out.println("순회 출력 ");
		Arrays.stream(arr).forEach(n -> System.out.println(n)); 
		//합계
		int sum = Arrays.stream(arr).sum();
		//평균  //OptionalDouble : 선택적 double (double값이 있을 수도, 없을 수도 있는 경우 사용)
		OptionalDouble avg = Arrays.stream(arr).average();
		//최대값
		OptionalInt max = Arrays.stream(arr).max();
		//최소값
		OptionalInt min = Arrays.stream(arr).min();
		//요소 개수  //stream() 이용 -> 데이터값 정해져있지 않기 때문에 int로 확실하게 형변환 필요
		int cnt = (int) Arrays.stream(arr).count();
		
		System.out.println("arr의 합계 : " + sum);
		System.out.println("arr의 평균 : " + avg);
		System.out.println("arr의 최대값 : " +max);
		System.out.println("arr의 최소값 : " + min);
		System.out.println("arr의 개수 : " + cnt);
	}
}

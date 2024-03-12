package sec1;

import java.text.DecimalFormat;

//Decimal Format : 숫자 표시 형식 지정하여 활용하는 클래스
public class DecimalFormatExam {

	public static void main(String[] args) {
//		표시 형식 코드 : 0, #
//		 1234.56
//		 0 => 1234, 0.0 => 1234.5, 000000.00000 => 001234.56000
//		 # => 1234, #.# => 1234.5, ######.##### => 1234.56 (유효숫자만 표시)
//		 -1234
//		-0(-#) => -1234 /  0-(#-) => 1234-
//		/#,##0 => -1,234 (, : 천단위 구분 기호)
//		#E0 => 1.234E + 03 (10의 3제곱) (E: 지수형태 표시)
//		#% => -123400% (% : 백분율 표시) (*100)
		
		double n = 1234567.89;
		System.out.println("1234567.89");
		
		DecimalFormat df1 = new DecimalFormat("#,##0.0000"); //생성자에 표시형식 코드 지정
		String res1 = df1.format(n);
		System.out.println("#,##0.0000 형식 : "+ res1); // >>> 1,234,567.8900
		
		DecimalFormat df2 = new DecimalFormat("000,000,000.####"); 
		String res2 = df2.format(n);
		System.out.println("000,000,000.#### 형식 : "+ res2); // >>> 001,234,567.89
		
		//DecimalFormat df3 = new DecimalFormat("0;\\ #, ##0;-\\ #,##0"); 
		
		
		
		
	}

}

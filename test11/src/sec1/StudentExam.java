package sec1;

public class StudentExam {

	public static void main(String[] args) throws CloneNotSupportedException {
		//instanceof 연산자 : 앞의 변수가 뒤의 클래스로부터 생성된 것인지 비교
		Student su1 = new Student();
		System.out.println(su1 instanceof Student);// >>> true
		
		//Student su3 = new Student();
		Student su3 = (Student) su1.clone();
		//clone() 내에 새 생성자 구문이 있으므로 선언만 해야 함
		//throws ... 추가 필요
		
		//기본 equals() (오버라이딩 x)
		System.out.println(su3.equals(su1)); // >>> false
		// su3과 su1의 주소가 서로 다름
		//오버라이딩 한 equals() : 값 비교 >>> true
		// 두 객체 모두 값 지정 안했기 때문에 null값으로 값 동일
	
	}

}

package creational.builder;

//Builder Pattern : 멤버필드와 같은 구성원을 하나하나 쌓아올려 객체를 생성하는 패턴

class Student {
	int no;
	String name;
	int point;
	String phoneNumber;
	
	public Student(int no, String name, int point, String phoneNumber) {
		super();
		this.no = no;
		this.name = name;
		this.point = point;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}

class StudentBuilder {
	private int no;
	private String name;
	private int point;
	private String phoneNumber;
	
	public StudentBuilder no(int no) {
		this.no = no;
		return this;
	}
	
	public StudentBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public StudentBuilder point(int point) {
		this.point = point;
		return this;
	}
	
	public StudentBuilder phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	
	public Student build() {
		return new Student(no, name, point, phoneNumber);
	}
	
	
}

public class BuilderPattern {

	public static void main(String[] args) {
		Student st = new StudentBuilder()
				.no(1001)
				.name("학생1")
				.point(80)
				.phoneNumber("010-1111-2222")
				.build();
		
		System.out.println(st.toString());
		
		
		Student st2 = new StudentBuilder()
				.no(1002)
				.build();
		System.out.println(st2.toString()); //>>>초기값으로 출력
		
		//BuilderPattern : 해당 멤버를 하나씩 메소드 체이닝 방법에 의해 추가
	}

}

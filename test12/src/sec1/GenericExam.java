package sec1;

public class GenericExam {

	public static void main(String[] args) {
		Generic1<Student> s = new Generic1<>(); // = new Generic1<Student>();
		Generic1<Teacher> t = new Generic1<>();
		//Generic1<int> i = new Generic1<>(); //기본형은 사용 불가
		Generic1<Integer> i = new Generic1<>();
		Generic1<String> str = new Generic1<>();
		
		Student a = new Student("학생1", 24);
		s.setField1(a); //객체 
		
		Teacher b = new Teacher("선생1", 48);
		t.setField1(b);
		
		i.setField1(123);
		str.setField1("문자열");
		
		
	}

}

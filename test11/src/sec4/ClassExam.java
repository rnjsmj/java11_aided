package sec4;

public class ClassExam {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person p1 = new Person("권민지", 24);
		//p1 객체의 패키지 이름과 클래스명 출력
		System.out.println("p1 클래스 : "+p1.getClass().getName());

		Class<Person> p2 = Person.class;
		System.out.println("p2 클래스 : "+p2.getName());
		
		
		//********클래스 동적 로딩*********
		Class p3 = Class.forName("sec4.Person"); //throws .... 구문 추가
		//클래스를 지정할 수 있음
		System.out.println("p3 클래스 : "+p3.getName());
		
		Person p4 = (Person) p3.newInstance(); //throws .... 구문 추가
		System.out.println("p4 클래스 : "+p4.getName());
		p4.setName("권민지");
		p4.setAge(24);
		System.out.println("p4 인스턴스 주소 : " + p4);
		System.out.println("p4 인스턴스 주소 : " + p4.toString());
		
		
		/* p.386
		String a = new String("abc");
		String b = new String("def");
		String a = a+b;
		System.out.println(a);
		*/
	}

}

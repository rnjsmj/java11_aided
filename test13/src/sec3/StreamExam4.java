package sec3;

import java.util.ArrayList;
import java.util.List;

//Class 타입의 List Stream 방식 활용
class Visitor{
	private String name;
	private int age;
	private int price;
	
	
	public Visitor() {
	}
	public Visitor(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Visitor [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
	
}


public class StreamExam4 {

	public static void main(String[] args) {
		List<Visitor> vList = new ArrayList<>();
		Visitor v1 = new Visitor("권민지", 24, 1000);
		Visitor v2 = new Visitor("할모니", 80, 0);
		Visitor v3 = new Visitor("뿡뿡이", 15, 500);
		Visitor v4 = new Visitor("굳건이", 22, 0);
		Visitor v5 = new Visitor("햄순이", 29, 1000);
		
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		
		//Stream<Visitor> vStream = vList.stream();
		//순회
		System.out.println("***순회***");
		vList.stream().forEach(vis -> System.out.println(vis.toString()));
		
		System.out.println("\n***이름***");
		vList.stream().map(vis -> vis.getName()).forEach(s -> System.out.println(s));
		
		//조건 검색
		System.out.println("\n***age > 20 filter + sorted***");
		vList.stream().filter(vis -> vis.getAge() >= 20).map(s -> s.getName()).sorted().forEach(s -> System.out.println(s));
	}

}

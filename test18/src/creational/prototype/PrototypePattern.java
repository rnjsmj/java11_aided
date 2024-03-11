package creational.prototype;

import java.util.List;

//Prototype Pattern : 
public class PrototypePattern {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee(); //Employee ==> prototype
		emp1.loadData();
		
		Employee emp2 = (Employee) emp1.clone();
		List<String> list = emp2.getEmpList(); //Prototype으로부터 얻어진 복제품
		list.add("추가");
		for(String s : list) {
			System.out.println(s);
		}
		
	}
}

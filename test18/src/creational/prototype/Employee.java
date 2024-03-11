package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable { //자바에 존재하는 interface
	
	private List<String> empList;

	public Employee(List<String> empList) {
		this.empList = empList;
	}
	
	public Employee() {
		empList = new ArrayList<String>();
	}

	public void loadData() {
		empList.add("직원1");
		empList.add("직원2");
		empList.add("직원3");
		empList.add("직원4");
		empList.add("직원5");
	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> tmp = new ArrayList<String>();
		
		//empList의 요소를 하나씩 tmp에 복제
		for (String s : empList ) {
			tmp.add(s);
		}
		
		return new Employee(tmp); //Employee 객체 생성
	}

	@Override
	public String toString() {
		return "Employee [empList=" + empList + "]";
	}
	
	
	
	
}

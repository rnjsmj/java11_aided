package sec3;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) {
		//Properties 선언 및 생성
		Properties pro = new Properties();
		
		//element
		pro.setProperty("name", "minji");
		pro.setProperty("age", "24");
		pro.setProperty("local", "갈현동");
		
		System.out.println("****Properties****");
		System.out.println("Properties : " + pro);
		System.out.println("엘리먼트 수 : " + pro.size());
		System.out.println("name : " + pro.getProperty("name"));
		
		//순회 => 열거형으로 해당 엘리먼트의 키(속성)를 가져와 처리해야함
		System.out.println("**순회**");
		Enumeration e = pro.propertyNames(); //keySet과 유사함 
		while(e.hasMoreElements()) {
			String el = (String) e.nextElement();
			System.out.println(el + " : " + pro.getProperty(el));
		}
		
	}

}

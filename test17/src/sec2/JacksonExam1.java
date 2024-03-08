package sec2;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;

class User {
	private String name;
	private int age;
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public User() {
		super();
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
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}


//웹 전용이 아닌 일반적인 데이터 형변환의 경우
public class JacksonExam1 {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper(); //jackson-databind package
		
		User user = new User("유저", 33);
		try {
			//객체(user)를 JSON 타입의 파일로 변환
			mapper.writeValue(new File("member.json"), user);
			// >>> 밑의 jsonUser가 브라우저에 출력됨
			
			//객체를 JSON 타입의 String으로 변환
			String jsonUser = mapper.writeValueAsString(user); 
			
			System.out.println(jsonUser);
			// >>> User:{'name':'유저', 'age':33}
		} catch(JsonGenerationException e) { //jackson-core package
			System.out.println("JSON 변환 실패");
		}
		
	}

}

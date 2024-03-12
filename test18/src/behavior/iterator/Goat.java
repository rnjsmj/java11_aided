package behavior.iterator;

public class Goat implements Animal{

	@Override
	public void eat() {
		System.out.println("주로 짧은 풀을 뜯어먹습니다.");
	}

	@Override
	public void sleep() {
		System.out.println("엎드려서 잠을 잡니다.");
	}

	@Override
	public void sound() {
		System.out.println("음메..");
	}
	

}

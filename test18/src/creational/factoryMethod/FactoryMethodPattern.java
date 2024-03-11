package creational.factoryMethod;
//Factory Method 패턴 : 객체를 만드는 부분을 서브 클래스에 위임하는 패턴
//부모 추상 클래스로 선언, 서브 클래스 생성자로 생성 (Factory => IDCardFactory)
//
public class FactoryMethodPattern {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("카드1");
		Product card2 = factory.create("카드2");
		card1.use();
		card2.use();
		
	}

}

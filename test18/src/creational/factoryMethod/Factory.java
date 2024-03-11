package creational.factoryMethod;
//Product 추상 클래스의 객체를 생성하는 추상 클래스의 create() 메서드
//=> Product를 만드는 create() 메서드를 통해 Factory Method 패턴 적용 
public abstract class Factory {
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct (p);
		return p;
	}
	
	protected abstract Product createProduct(String owner);
	
	protected abstract void registerProduct(Product p);
	
}

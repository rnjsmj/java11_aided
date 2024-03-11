package creational.abstractfactory;

public abstract class Item { //Link, Page, Tray의 Superclass
	//protected : 패키지가 달라도 상속받으면 사용할 수 있는 instance
	protected String caption;
	
	public Item(String caption) {
		this.caption = caption;
	}
	
	public abstract String makeHTML();
	

}

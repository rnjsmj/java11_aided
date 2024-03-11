package creational.abstractfactory;
//Item 클래스를 구현하는 추상클래스

public abstract class Link extends Item{
	protected String url;
	
	//<a href="{url}">{caption}</a>
	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}
	
	public abstract String makeHTML();
	

}

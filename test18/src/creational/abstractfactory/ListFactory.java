package creational.abstractfactory;

//Factory의 추상메서드 구현
public class ListFactory extends Factory{

	@Override
	public Link createLink(String caption, String url) {
		return null;
	}

	@Override
	public Tray createTray(String caption) {
		return null;
	}

	@Override
	public Page createPage(String title, String author) {
		return null;
	}
	
	
}

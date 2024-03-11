package creational.abstractfactory;

//Link 구현
public class ListLink extends Link{

	@Override
	public String makeHTML() {
		return "<a href=\"" + url + "\">" + caption + "</a>";
	}
	
	public ListLink(String caption, String url) {
		super(caption, url);	
	}
	
	

}

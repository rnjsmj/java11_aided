package creational.abstractfactory;

public class ListTray extends Tray {
	public ListTray(String caption) {
		super(caption);
	}

	//상세메뉴
	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>" + caption);
		buffer.append("<ul>");
		for (Object o : tray) {
			Item item = (Item) o;
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n");
		buffer.append("</li>\n");
		return buffer.toString();
	}
	
	
}

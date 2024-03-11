package creational.abstractfactory;

import java.util.ArrayList;

public abstract class Tray extends Item{
	protected ArrayList tray = new ArrayList(); //*

	public Tray(String caption) {
		super(caption); //Item 클래스의 생성자 호출
		
	}
	
	public void add(Item item) {
		tray.add(item);
	}
	
	

}

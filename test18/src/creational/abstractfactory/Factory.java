package creational.abstractfactory;

import java.lang.reflect.InvocationTargetException;

//Factory class : 추상 클래스를 만드는 역할을 하는 추상 클래스
//구현부를 신경쓰지 않고 추상체(interface)를 만들기 위한 클래스
public abstract class Factory {
	//Factory 클래스의 getFactory() 메서드 : 매개변수로 받은 클래스로 만들어진것인지 확인 
	
	//정적 메서드
	public static Factory getFactory(String classname) {
		Factory factory = null;
		
		try {
			factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("클래스 " + classname + "이 발견되지 않았습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return factory;
	}
	
	//추상메서드 => 세 메서드를 묶어주는 추상클래스를 또 하나 생성해야 함
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
	
	
}
